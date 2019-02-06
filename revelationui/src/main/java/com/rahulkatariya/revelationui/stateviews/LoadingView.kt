package com.rahulkatariya.revelationui.stateviews

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.*
import com.rahulkatariya.revelationui.R

class LoadingView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    val progressBar by lazy { findViewById<ProgressBar>(R.id.viewLoadingProgressBar) }

    init {
        LayoutInflater.from(context).inflate(R.layout.loading, this)
    }

}