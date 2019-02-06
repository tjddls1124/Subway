package com.example.subway.ui.start

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.subway.R
import kotlinx.android.synthetic.main.start_fragment.*


class Start : Fragment() {

    companion object {
        fun newInstance() = Start()
    }

    private lateinit var viewModel: StartViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return inflater.inflate(R.layout.start_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(StartViewModel::class.java)
        // TODO: Use the ViewModel
        iv_allMenuButton.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_start2_to_allMenus2)
        }
    }

}
