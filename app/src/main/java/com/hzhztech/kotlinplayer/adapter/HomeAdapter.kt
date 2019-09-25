package com.hzhztech.kotlinplayer.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.hzhztech.kotlinplayer.widget.HomeItemView

class HomeAdapter: RecyclerView.Adapter<HomeAdapter.HomeHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): HomeHolder {
        return HomeHolder(HomeItemView(parent?.context))
    }

    override fun onBindViewHolder(p0: HomeHolder, p1: Int) {
    }


    override fun getItemCount(): Int {
        return 20
    }

    class HomeHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }
}