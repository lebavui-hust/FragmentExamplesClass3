package vn.edu.hust.fragmentexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val blankFragment = BlankFragment.newInstance("RED", "GREEN")
        supportFragmentManager.beginTransaction()
            .add(R.id.frame_layout, blankFragment)
            .commit()
    }
}