package com.rahulkatariya.revelationui.stateviews

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.*
import com.rahulkatariya.revelationui.R

class ErrorView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    val textView by lazy { findViewById<TextView>(R.id.viewErrorTextView) }
    val retryButton by lazy { findViewById<Button>(R.id.viewErrorRetryButton) }

    init {
        LayoutInflater.from(context).inflate(R.layout.error, this)
    }

}
