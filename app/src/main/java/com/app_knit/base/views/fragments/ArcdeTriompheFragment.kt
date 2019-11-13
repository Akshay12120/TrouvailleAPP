package com.app_knit.base.views.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_arcde_triomphe.*
import kotlinx.android.synthetic.main.fragment_notification.*

/**
 * A simple [Fragment] subclass.
 */
class ArcdeTriompheFragment : BaseFragment() {
    override val layoutId: Int
        get() = R.layout.fragment_arcde_triomphe
    override val viewModel: BaseViewModel?
        get() = null
    override fun init() {
       tvToolbarTitle.setText(R.string.arc_de_triomphe)
        Glide.with(this)
                .load("https://www.unjourdeplusaparis.com/wp-content/uploads/2014/01/arc-de-triomphe-paris-800x500.jpg")
                .placeholder(R.drawable.ic_profile)
                .into(iv_Arc_de_triomphe)
    }

}
