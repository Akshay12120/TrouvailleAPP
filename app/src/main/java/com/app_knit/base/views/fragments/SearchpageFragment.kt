package com.app_knit.base.views.fragments


import androidx.fragment.app.Fragment
import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel
import kotlinx.android.synthetic.main.fragment_searchpage.*

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


    }
}




