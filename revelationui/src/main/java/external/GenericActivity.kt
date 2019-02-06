package external

import android.os.Bundle
import android.view.View

class GenericActivity<V: View>(val rootView: V) : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(rootView)
    }

}