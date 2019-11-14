package com.app_knit.base.views.fragments


import android.os.Build
import android.os.Bundle
import android.view.*
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

import com.app_knit.base.R
import com.app_knit.base.repository.models.Tab
import com.app_knit.base.viewmodels.BaseViewModel
import com.app_knit.base.views.activities.BaseAppCompactActivity
import com.app_knit.base.views.activities.doFragmentTransaction
import kotlinx.android.synthetic.main.fragment_base_tab_layout.*
import kotlinx.android.synthetic.main.row_all_placeslist.*

/**
 * A simple [Fragment] subclass.
 */
class ExploreFragment : BaseTabLayoutFragment() {
    override fun initTabs() {
        val tablist = mutableListOf<Tab>()
        tablist.add(Tab(AllPlacesFragment(),"All palces",R.drawable.drawable_color_allplace_selector,true))
        tablist.add(Tab(VisitedbyFriendsFragment(),"Visited by Friends",R.drawable.drawable_color_allplace_selector,true))
        val window = activity!!.window
        // change the color of statusBar
        window.statusBarColor = ContextCompat.getColor(activity!!, R.color.colorMaroon)
        appBarLayout.setBackgroundColor(ContextCompat.getColor(activity!!,R.color.colorMaroon))
        ivToolbarActionEnd.setImageResource(R.drawable.ic_searchwhite)
        ivToolbarActionEnd.visibility = (view!!.visibility)
        ivToolbarActionEnd.setOnClickListener { (activity as BaseAppCompactActivity).doFragmentTransaction(fragManager = activity!!.supportFragmentManager, containerViewId = R.id.flFragContainerMain, fragment = SearchpageFragment(),isAddFragment = false) }
        setViewPager("Explore",tablist)
        tabLayout.tabTextColors = ContextCompat.getColorStateList(activity!!,R.color.colorWhite)

    }

    override val layoutId: Int
        get() = R.layout.fragment_base_tab_layout
    override val viewModel: BaseViewModel?
        get() = null




}
