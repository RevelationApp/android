package com.rahulkatariya.revelationui.stateviews

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.*
import com.rahulkatariya.revelationui.R

class EmptyView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    val textView by lazy { findViewById<TextView>(R.id.viewEmptyTextView) }

    init {
        LayoutInflater.from(context).inflate(R.layout.empty, this)
    }

}