package com.example.subway.AllMenu

import android.graphics.drawable.Drawable
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.subway.R
import kotlinx.android.synthetic.main.all_menus_fragment.*


class AllMenus : Fragment() {

    companion object {
        fun newInstance() = AllMenus()
    }

    private lateinit var viewModel: AllMenusViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.all_menus_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AllMenusViewModel::class.java)
        // TODO: Use the ViewModel

        //List&Adapter addition
        val list = mutableListOf<SubwayItem>()
        list.add(SubwayItem(ContextCompat.getDrawable(context!!,R.drawable.sandwich)!!,"이탈리안 비엘티",6300))
        list.add(SubwayItem(ContextCompat.getDrawable(context!!,R.drawable.meetball)!!,"미트볼",5400))
        val subwayAdpater = AllMenuListAdapter(list)
        recyclerview.adapter = subwayAdpater
        recyclerview.addItemDecoration(
            DividerItemDecoration(context,DividerItemDecoration.VERTICAL)
        )

    }

}
