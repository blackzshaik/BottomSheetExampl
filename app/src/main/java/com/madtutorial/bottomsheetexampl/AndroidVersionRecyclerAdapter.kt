package com.madtutorial.bottomsheetexampl

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AndroidVersionRecyclerAdapter(private val versionList:Array<String>)
    :RecyclerView.Adapter<AndroidVersionRecyclerViewHolder>() {
        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): AndroidVersionRecyclerViewHolder {

        return  AndroidVersionRecyclerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_list_view,parent,false))
    }

    override fun getItemCount(): Int  = versionList.size

    override fun onBindViewHolder(holder: AndroidVersionRecyclerViewHolder, position: Int) {
        holder.bind(versionList[position])
    }


}