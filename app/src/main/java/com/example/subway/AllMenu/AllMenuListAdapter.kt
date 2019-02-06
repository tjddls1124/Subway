package com.example.subway.AllMenu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.subway.R
import kotlinx.android.synthetic.main.subwaylist.view.*

class AllMenuListAdapter(private val items: List<SubwayItem>) : RecyclerView.Adapter<AllMenuListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //recyclerView 가 초기화될 때 onCreateViewHolder 호출
        //inflating 필수
        val inflateView = LayoutInflater.from(parent.context).inflate(R.layout.subwaylist,parent,false)
        return AllMenuListAdapter.ViewHolder(inflateView)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //View 생성이후 호출
        //Listener등 이후 동작 구현
        val item = items[position]
        //TODO : Change Listener
        val listener = View.OnClickListener { it->
            Toast.makeText(it.context, "Clicked: ${item.name}", Toast.LENGTH_SHORT).show()
        }
        holder.apply {
            bind(listener,item)
            itemView.tag = item
        }
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {

        private var view: View = v

        fun bind(listener: View.OnClickListener, item: SubwayItem) {
            view.iv_sandwich.setImageDrawable(item.image)
            view.tv_name.setText(item.name)
            view.tv_price.setText(""+item.price+"원")
            view.setOnClickListener(listener)
        }

    }



}