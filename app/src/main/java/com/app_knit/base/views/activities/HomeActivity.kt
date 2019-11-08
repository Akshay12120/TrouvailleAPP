package com.app_knit.base.views.activities

import com.app_knit.base.R

class HomeActivity : BaseAppCompactActivity() {

    override val layoutId: Int
        get() = R.layout.activity_home

    override val isMakeStatusBarTransparent: Boolean
        get() = true

    override fun init() {
    }

}