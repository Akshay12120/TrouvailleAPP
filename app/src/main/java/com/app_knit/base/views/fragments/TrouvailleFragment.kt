package com.app_knit.base.views.fragments


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.app_knit.base.R
import com.app_knit.base.viewmodels.BaseViewModel
import com.app_knit.base.views.activities.BaseAppCompactActivity
import com.app_knit.base.views.activities.doFragmentTransaction
import kotlinx.android.synthetic.main.fragment_trouvaille.*

/**
 * A simple [Fragment] subclass.
 */
class TrouvailleFragment : BaseFragment(),View.OnClickListener {
    override val layoutId: Int
        get() = R.layout.fragment_trouvaille
    override val viewModel: BaseViewModel?
        get() = null

    override fun init() {
        activity!!.window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.colorTransparent)
        activity!!.window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        signinBtn.setOnClickListener(this)
        signin_GoogleBtn.setOnClickListener(this)
        signin_FacebookBtn.setOnClickListener(this)
        txtv_create_account.setOnClickListener(this)


    }

    override fun onClick(p0: View?) {
        when(p0!!.id){
            R.id.signinBtn ->{
                (activity as BaseAppCompactActivity).doFragmentTransaction(fragManager = activity!!.supportFragmentManager, containerViewId = R.id.flFragContainerMain, fragment = WelcomeTrouvailleFragment(), isAddFragment = false)
            }
            R.id.signin_GoogleBtn ->{
                (activity as BaseAppCompactActivity).doFragmentTransaction(fragManager = activity!!.supportFragmentManager, containerViewId =R.id.flFragContainerMain, fragment = BottomNavigationTabLayoutFragment(), isAddFragment = false  )
            }
            R.id.signin_FacebookBtn ->{
                (activity as BaseAppCompactActivity).doFragmentTransaction(fragManager = activity!!.supportFragmentManager, containerViewId =R.id.flFragContainerMain, fragment = BottomNavigationTabLayoutFragment(), isAddFragment = false  )
            }
            R.id.txtv_create_account ->{
                (activity as BaseAppCompactActivity).doFragmentTransaction(fragManager = activity!!.supportFragmentManager, containerViewId =R.id.flFragContainerMain, fragment = SetupAccountFragment(), isAddFragment = false  )
            }

        }
    }


}
