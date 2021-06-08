package com.madtutorial.bottomsheetexampl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {

    private lateinit var bsBehavior: BottomSheetBehavior<ConstraintLayout>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomSheet = findViewById<ConstraintLayout>(R.id.listBottomSheet)
        bsBehavior  = BottomSheetBehavior.from(bottomSheet)

        findViewById<Button>(R.id.showBottomSheetButton).setOnClickListener {
            bsBehavior.state = BottomSheetBehavior.STATE_EXPANDED
            findViewById<RecyclerView>(R.id.versionList).adapter =
                    AndroidVersionRecyclerAdapter(resources.getStringArray(R.array.android_names))
            findViewById<TextView>(R.id.title).text = "Bottom Sheet"

        }

        findViewById<Button>(R.id.showBottomSheetFragmentButton).setOnClickListener {
            BSDialogFragment().show(supportFragmentManager,"BSDialogFragment")

        }

    }
}