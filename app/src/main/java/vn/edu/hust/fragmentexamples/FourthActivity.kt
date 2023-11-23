package vn.edu.hust.fragmentexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        findViewById<Button>(R.id.button_add).setOnClickListener {
            val blankFragment = BlankFragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragmentContainerView, blankFragment, "BLANK")
                .addToBackStack("BLANK")
                .commit()
        }

        findViewById<Button>(R.id.button_replace).setOnClickListener {
            val blankFragment = BlankFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, blankFragment, "BLANK")
                .addToBackStack("BLANK")
                .commit()
        }

        findViewById<Button>(R.id.button_remove).setOnClickListener {
            val fragment = supportFragmentManager.findFragmentByTag("BLANK")
            if (fragment != null) {
                supportFragmentManager.beginTransaction()
                    .remove(fragment)
                    .commit()
            }
        }
    }
}