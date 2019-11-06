package com.app_knit.base.views.fragments


import android.os.Build
import android.os.Bundle
import android.view.*
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

import com.app_knit.base.R
import com.app_knit.base.repository.models.Tab
import com.app_knit.base.viewmodels.BaseViewModel
import kotlinx.android.synthetic.main.fragment_base_tab_layout.*

/**
 * A simple [Fragment] subclass.
 */
class ExploreFragment : BaseTabLayoutFragment() {
    override fun initTabs() {
        val tablist = mutableListOf<Tab>()
        tablist.add(Tab(AllPlacesFragment(),"All palces",0,true))
        tablist.add(Tab(VisitedbyFriendsFragment(),"Visited by Friends",0,true))
        val window = activity!!.window
        // change the color of statusBar
        window.statusBarColor = ContextCompat.getColor(activity!!, R.color.maroon)
        appBarLayout.setBackgroundColor(ContextCompat.getColor(activity!!,R.color.maroon))
        setViewPager("Explore",tablist)
    }

    override val layoutId: Int
        get() = R.layout.fragment_base_tab_layout
    override val viewModel: BaseViewModel?
        get() = null




}
