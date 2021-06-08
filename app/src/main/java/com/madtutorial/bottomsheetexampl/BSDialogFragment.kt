package com.madtutorial.bottomsheetexampl

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BSDialogFragment : BottomSheetDialogFragment() {

    private lateinit var rootView: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        rootView = LayoutInflater.from(context).inflate(R.layout.list_bottom_sheet, container, false)
        return rootView
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        rootView.findViewById<TextView>(R.id.title).text = "Bottom Sheet Dialog Fragment"
        rootView.findViewById<RecyclerView>(R.id.versionList).adapter =
                AndroidVersionRecyclerAdapter(resources.getStringArray(R.array.german_cars))

    }
}