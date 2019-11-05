package com.app_knit.base.views.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Toolbar
import androidx.fragment.app.FragmentManager

import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel
import com.app_knit.base.views.adapters.TopTabspagerAdapter
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_base_tab_layout.*
import kotlinx.android.synthetic.main.toolbar.*

/**
 * A simple [Fragment] subclass.
 */
class ConnectWithFriendTabLayoutFragment : BaseTabLayoutFragment() {
    override fun initTabs() {

    }

    override val layoutId: Int
        get() = R.layout.fragment_connect_with_friend
    override val viewModel: BaseViewModel?
        get() = null

    override fun init() {
       //set the text of the toolbarTitle
        tvTitle.text = "Connect with Friends"


        //set the color of the text in  title of the toolbar
        tvTitle.setTextColor(resources.getColor(R.color.colorWhite))
        //set the textSize of toolbar
        tvTitle.textSize = 17f
        //set the color of appbar layout color
        appBarLayout.setBackgroundColor(resources.getColor(R.color.maroon))

        val topTabspagerAdapter = TopTabspagerAdapter(activity!!.supportFragmentManager)
        viewPager.adapter =topTabspagerAdapter
        //setup the ViewPager
        tabLayout.setupWithViewPager(viewPager)
        //set the icon of the tabs
        tabLayout.getTabAt(0)!!.setIcon(R.drawable.ic_friends_selected)
        tabLayout.getTabAt(1)!!.setIcon(R.drawable.ic_searchwhite)
        tabLayout.getTabAt(2)!!.setIcon(R.drawable.ic_contact)
        tabLayout.getTabAt(3)!!.setIcon(R.drawable.ic_request)



    }


}
