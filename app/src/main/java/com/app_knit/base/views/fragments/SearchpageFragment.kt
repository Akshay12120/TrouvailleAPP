package com.app_knit.base.views.fragments


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment

import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel
import com.app_knit.base.views.activities.BaseAppCompactActivity
import com.app_knit.base.views.activities.doFragmentTransaction
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
        ivCancel.setOnClickListener { (activity as BaseAppCompactActivity).doFragmentTransaction(fragManager = activity!!.supportFragmentManager, containerViewId = R.id.flFragContainerMain, fragment = ConnectWithFriendTabLayoutFragment(),isAddFragment = false) }
    }
    }





