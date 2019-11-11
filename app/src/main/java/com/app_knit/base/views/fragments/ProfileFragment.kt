package com.app_knit.base.views.fragments


import android.content.Context
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
import kotlinx.android.synthetic.main.fragment_profile.*

/**
 * A simple [Fragment] subclass.
 */
class ProfileFragment : BaseFragment() {
    override val layoutId: Int
        get() = R.layout.fragment_profile
    override val viewModel: BaseViewModel?
        get() = null
    override fun init() {

       //Spannable String: to change the color of multiple texts in one textView
        val txt = SpannableString(getString(R.string.punta_cana))
        val txt2 = getString(R.string.dominican_Republic)
        val index = txt.toString().indexOf(txt2,ignoreCase = true)
        val indexend = index+txt2.length
        txt.setSpan(ForegroundColorSpan(ContextCompat.getColor(activity!!,R.color.colorGray3)),index,indexend, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        txTvpunta.setText(txt, TextView.BufferType.SPANNABLE)

        val txt3 =SpannableString(getString(R.string.punta_cana))
        val txt4 = getString(R.string.dominican_Republic)
        val index2  = txt3.toString().indexOf(txt4,ignoreCase = true)
        val indexend2 = index2+txt4.length
        txt.setSpan(ForegroundColorSpan(ContextCompat.getColor(activity!!,R.color.colorGray3)),index,indexend2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        txTvPunta2.setText(txt, TextView.BufferType.SPANNABLE)




    }


}
