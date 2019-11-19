package com.app_knit.base.views.fragments


import android.content.Context
import android.view.View
import android.view.WindowManager
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel


/**
 * A simple [Fragment] subclass.
 */
class ResetPasswordFragment : BaseFragment() {
    override val layoutId: Int
        get() = R.layout.fragment_reset_password
    override val viewModel: BaseViewModel?
        get() = null
    override fun init() {
        val window = activity!!.window
        window.decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR)
        window.setStatusBarColor(ContextCompat.getColor(activity!!,R.color.colorWhite))

    }


}
