package com.app_knit.base.views.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel

/**
 * A simple [Fragment] subclass.
 */
class WelcomeTrouvailleFragment : BaseFragment() {
    override val layoutId: Int
        get() = R.layout.fragment_welcometo_trouvaille
    override val viewModel: BaseViewModel?
        get() =null

    override fun init() {

    }


}
