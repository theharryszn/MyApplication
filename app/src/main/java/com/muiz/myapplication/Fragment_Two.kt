package com.muiz.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.muiz.myapplication.data.News

class Fragment_Two : Fragment() {
    private var name: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            name = it.getString("name")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment__two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.text)?.text = "Hello $name"

        view.findViewById<Button>(R.id.anotherBtn).setOnClickListener { run {
            parentFragmentManager.beginTransaction().remove(this).commit()
            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(name: String) =
            Fragment_Two().apply {
                arguments = Bundle().apply {
                    putString("name", name)
                }
            }
    }
}