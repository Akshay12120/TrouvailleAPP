package com.app_knit.base.views.fragments


import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel
import com.app_knit.base.views.activities.BaseAppCompactActivity
import com.app_knit.base.views.activities.doFragmentTransaction
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.fragment_welcometo_trouvaille.*

/**
 * A simple [Fragment] subclass.
 */
class WelcomeTrouvailleFragment : BaseFragment() {
    override val layoutId: Int
        get() = R.layout.fragment_welcometo_trouvaille
    override val viewModel: BaseViewModel?
        get() = null

    override fun init() {
        val txt = SpannableString(getString(R.string.welcome_to_trouvaille))
        val txt2 = getString(R.string.trouvaille)
        val index = txt.toString().indexOf(txt2, ignoreCase = true)
        val indexend = index + txt2.length
        txt.setSpan(ForegroundColorSpan(ContextCompat.getColor(activity!!, R.color.colorMaroon)), index, indexend, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        txtv_welcmTrouvle.setText(txt, TextView.BufferType.SPANNABLE)

        signinBtn.setOnClickListener{(activity as BaseAppCompactActivity).doFragmentTransaction(fragManager = activity!!.supportFragmentManager,containerViewId = R.id.flFragContainerMain, fragment = BottomNavigationTabLayoutFragment(), isAddFragment = false)}
        txtv_create_account.setOnClickListener {
            (activity as BaseAppCompactActivity).doFragmentTransaction(fragManager = activity!!.supportFragmentManager, containerViewId = R.id.flFragContainerMain, fragment = SetupAccountFragment(), isAddFragment = false) }

        txtv_forgot_paswrd.setOnClickListener {
            (activity as BaseAppCompactActivity).doFragmentTransaction(fragManager = activity!!.supportFragmentManager, containerViewId = R.id.flFragContainerMain, fragment = ResetPasswordFragment(), isAddFragment = false)
        }
        val window = activity!!.window
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        window.statusBarColor = ContextCompat.getColor(activity!!, R.color.colorWhite)

    }


}
