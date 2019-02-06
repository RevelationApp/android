package com.rahulkatariya.revelationui

import android.content.Context
import android.view.View
import com.rahulkatariya.revelationui.stateviews.EmptyView
import com.rahulkatariya.revelationui.stateviews.ErrorView
import com.rahulkatariya.revelationui.stateviews.LoadingView
import external.StateActivity

object StateActivityFactory {
    fun build(context: Context): external.StateActivity<View, View, View> {
        val loadingView = LoadingView(context)
        val emptyView = EmptyView(context)
        val errorView = ErrorView(context)
        return build(loadingView, emptyView, errorView)
    }

    fun <L: View, E: View, R: View> build(
        loadingView: L,
        emptyView: E,
        errorView: R
    ): external.StateActivity<L, E, R> {
        return StateActivity(
            loadingView,
            emptyView,
            errorView
        )
    }
}