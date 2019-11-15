package com.app_knit.base.views.fragments


import androidx.fragment.app.Fragment
import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel
import kotlinx.android.synthetic.main.fragment_searchpage.*


import kotlinx.android.synthetic.main.toolbar.*
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
import android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE

import android.view.View


/**
 * A simple [Fragment] subclass.
 */
class SearchpageFragment : BaseFragment() {
    override val layoutId: Int
        get() = R.layout.fragment_searchpage
    override val viewModel: BaseViewModel?
        get() = null

    override fun init() {
        ivCancel.setOnClickListener { activity?.supportFragmentManager?.popBackStack() }
        //hide the status bar
        activity!!.window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_FULLSCREEN


    }
}




