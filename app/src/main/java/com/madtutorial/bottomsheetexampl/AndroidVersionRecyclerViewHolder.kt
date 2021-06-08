package com.madtutorial.bottomsheetexampl

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AndroidVersionRecyclerViewHolder(view: View): RecyclerView.ViewHolder(view){
    private val nameTextView: TextView = view.findViewById(R.id.versionNames)

    fun bind(versionName:String){
        nameTextView.text = versionName
    }
}