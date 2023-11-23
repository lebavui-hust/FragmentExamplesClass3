package vn.edu.hust.fragmentexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ThirdActivity : AppCompatActivity(), ItemClickListener {

    val listFragment = ListFragment()
    val detailFragment = DetailFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_list, listFragment)
            .add(R.id.fragment_detail, detailFragment)
            .commit()
    }

    override fun ItemClicked(item: String) {
        detailFragment.UpdateContent(item)
    }
}