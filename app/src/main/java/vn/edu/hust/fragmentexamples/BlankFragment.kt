package vn.edu.hust.fragmentexamples

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView = view.findViewById<TextView>(R.id.text_view)

        fragmentIndex++
        textView.text = "$fragmentIndex"

        view.findViewById<Button>(R.id.to_list_button).setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment_to_listFragment)
        }

        view.findViewById<Button>(R.id.to_detail_button).setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment_to_detailFragment)
        }

//        when (param1) {
//            "RED" -> view.setBackgroundColor(Color.RED)
//            "GREEN" -> view.setBackgroundColor(Color.GREEN)
//            "BLUE" -> view.setBackgroundColor(Color.BLUE)
//            else -> view.setBackgroundColor(Color.YELLOW)
//        }

//        when (param2) {
//            "RED" -> textView.setTextColor(Color.RED)
//            "GREEN" -> textView.setTextColor(Color.GREEN)
//            "BLUE" -> textView.setTextColor(Color.BLUE)
//            else -> textView.setTextColor(Color.BLACK)
//        }
    }

    companion object {
        var fragmentIndex = 0
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}