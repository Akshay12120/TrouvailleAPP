package com.app_knit.base.views.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.app_knit.base.views.fragments.ConnectWithFriendTabLayoutFragment
import com.app_knit.base.views.fragments.ExploreFragment
import com.app_knit.base.views.fragments.NotificationFragment
import com.app_knit.base.views.fragments.ProfileFragment

class BottomTabsPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            // Created four fragments
            0 -> {
                ExploreFragment()
            }
            1 -> {
                ConnectWithFriendTabLayoutFragment()
            }
            2 -> {
                NotificationFragment()
            }
            else -> {
                ProfileFragment()
            }

        }
    }

    override fun getCount(): Int {
        //return 4 tabs
        return 4

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 ->
                "Explore"

            1 ->
                "Social"

            2 ->
                "Notifications"

            else -> {
                return "Profile"
            }
        }
    }

}