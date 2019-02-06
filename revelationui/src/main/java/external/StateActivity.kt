package external

import android.os.Bundle
import android.view.View

class StateActivity<L: View, E: View, R: View>(
    val loadingView: L, val emptyView: E, val errorView: R
) : BaseActivity() {

    enum class ViewState {
        LOADING, EMPTY, CONTENT, ERROR, CUSTOM
    }

    var view: View? = null
    var viewState: ViewState? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun setContentView() {
        viewState = ViewState.CONTENT
    }

    fun setCustomView(View: View) {
        viewState = ViewState.CUSTOM
    }

}