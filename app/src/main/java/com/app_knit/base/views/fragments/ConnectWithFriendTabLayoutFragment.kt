package com.app_knit.base.views.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentManager

import com.app_knit.base.R
import com.app_knit.base.repository.models.Tab
import com.app_knit.base.viewmodels.BaseViewModel
import com.app_knit.base.views.adapters.TopTabspagerAdapter
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_base_tab_layout.*
import kotlinx.android.synthetic.main.fragment_base_tab_layout.tabLayout
import kotlinx.android.synthetic.main.fragment_bottom_navigation_tab_layout.*
import kotlinx.android.synthetic.main.toolbar.*

/**
 * A simple [Fragment] subclass.
 */
class ConnectWithFriendTabLayoutFragment : BaseTabLayoutFragment() {
    override fun initTabs() {
        val toptabs = mutableListOf<Tab>()
        toptabs.add(Tab(FriendsFragment(),"Friends",R.drawable.ic_friends_selected,true))
        toptabs.add(Tab(SearchpageFragment(),"Search",R.drawable.ic_searchwhite,true))
        toptabs.add(Tab(ContactsFragment(),"Contacts",R.drawable.ic_contact,true))
        toptabs.add(Tab(RequestsFragment(),"Requests",R.drawable.ic_request,true))


        setViewPager("Connect with Friends",toptabs)

        appBarLayout.setBackgroundColor(ContextCompat.getColor(activity!!,R.color.maroon))
        // set icons for tabs
        for (i in 0 until tabLayout.tabCount) {
            tabLayout.getTabAt(i)!!.setIcon(toptabs[i].tabIcon)
        }



    }

    override val layoutId: Int
        get() = R.layout.fragment_base_tab_layout

    override val viewModel: BaseViewModel?
        get() = null

//
//    override fun init() {
//       //set the text of the toolbarTitle
//
//
//        //set the color of the text in  title of the toolbar
//        tvTitle.setTextColor(resources.getColor(R.color.colorWhite))
//        //set the textSize of toolbar
//        tvTitle.textSize = 17f
//        //set the color of appbar layout color
//        appBarLayout.setBackgroundColor(resources.getColor(R.color.maroon))
//
//        val topTabspagerAdapter = TopTabspagerAdapter(activity!!.supportFragmentManager)
//        viewPager.adapter =topTabspagerAdapter
//        //setup the ViewPager
//        tabLayout.setupWithViewPager(viewPager)
//        //set the icon of the tabs
//        tabLayout.getTabAt(0)!!.setIcon(R.drawable.ic_friends_selected)
//        tabLayout.getTabAt(1)!!.setIcon(R.drawable.ic_searchwhite)
//        tabLayout.getTabAt(2)!!.setIcon(R.drawable.ic_contact)
//        tabLayout.getTabAt(3)!!.setIcon(R.drawable.ic_request)
//
//
//
//    }
//

}
