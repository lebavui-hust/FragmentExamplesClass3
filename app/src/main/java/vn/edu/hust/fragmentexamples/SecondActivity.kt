package vn.edu.hust.fragmentexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity(), ItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun UpdateDetail(item: String) {
        (supportFragmentManager.findFragmentById(R.id.fragment_detail) as DetailFragment)
            .UpdateContent(item)
    }

    override fun ItemClicked(item: String) {
        (supportFragmentManager.findFragmentById(R.id.fragment_detail) as DetailFragment)
            .UpdateContent(item)
    }
}