package com.app_knit.base.views.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel
import com.app_knit.base.views.adapters.BottomTabsPagerAdapter
import kotlinx.android.synthetic.main.fragment_base_tab_layout.*
import kotlinx.android.synthetic.main.fragment_bottom_navigation_tab_layout.*
import kotlinx.android.synthetic.main.fragment_bottom_navigation_tab_layout.tabLayout
import kotlinx.android.synthetic.main.fragment_bottom_navigation_tab_layout.viewPager

/**
 * A simple [Fragment] subclass.
 */
class BottomNavigationTabLayoutFragment : BaseTabLayoutFragment() {
    override fun initTabs() {

    }

    override val layoutId: Int
        get() = R.layout.fragment_bottom_navigation_tab_layout
    override val viewModel: BaseViewModel?
        get() = null
    override fun init() {
    val bottomTabsPagerAdapter = BottomTabsPagerAdapter(activity!!.supportFragmentManager)
        viewPager.adapter = bottomTabsPagerAdapter
        tabLayout.setupWithViewPager(viewPager)
        tabLayout.getTabAt(0)!!.setIcon(R.drawable.ic_explore)
        tabLayout.getTabAt(1)!!.setIcon(R.drawable.ic_social_selected)
        tabLayout.getTabAt(2)!!.setIcon(R.drawable.ic_notfication)
        tabLayout.getTabAt(3)!!.setIcon(R.drawable.ic_profile)
    }

}
