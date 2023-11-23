package vn.edu.hust.fragmentexamples

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class DetailFragment : Fragment() {

    lateinit var textDetail: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textDetail = view.findViewById(R.id.text_detail)

        val item = arguments?.getString("SELECTED_ITEM")
        if (item != null)
            textDetail.text = item
    }

    fun UpdateContent(item: String) {
        textDetail.text = item
    }
}