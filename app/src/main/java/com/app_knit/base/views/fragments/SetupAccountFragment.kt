package com.app_knit.base.views.fragments


import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel
import kotlinx.android.synthetic.main.fragment_setup_account.*
import kotlinx.android.synthetic.main.fragment_welcometo_trouvaille.*

/**
 * A simple [Fragment] subclass.
 */
class SetupAccountFragment : BaseFragment() {
    override val layoutId: Int
        get() = R.layout.fragment_setup_account
    override val viewModel: BaseViewModel?
        get() = null
    override fun init() {
        val txt = SpannableString(getString(R.string.setup_account))
        val txt2 = getString(R.string.account)
        val index = txt.toString().indexOf(txt2, ignoreCase = true)
        val indexend = index + txt2.length
        txt.setSpan(ForegroundColorSpan(ContextCompat.getColor(activity!!, R.color.colorMaroon)), index, indexend, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        txtv_setupAccount.setText(txt, TextView.BufferType.SPANNABLE)
    }


}
