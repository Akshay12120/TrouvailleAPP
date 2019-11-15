package com.app_knit.base.views.fragments


import android.text.SpannableString
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.app_knit.base.R
import com.app_knit.base.repository.models.DataSourceNotification
import com.app_knit.base.viewmodels.BaseViewModel
import com.app_knit.base.views.adapters.NotificationListAdapter
import kotlinx.android.synthetic.main.toolbar.*

/**
 * A simple [Fragment] subclass.
 */
class NotificationFragment : BaseRecyclerViewFragment() {
    override val layoutId: Int
        get() = R.layout.fragment_notification
    override val viewModel: BaseViewModel?
        get() = null

    override fun setData() {

        tvToolbarTitle.setText(R.string.Notification)
        val data = DataSourceNotification.createData()
        notificationListAdapter.submitList(data)
    }

    private val notificationListAdapter = NotificationListAdapter()

    override val recyclerViewAdapter: RecyclerView.Adapter<*>?
        get() = notificationListAdapter
    override val layoutManager: RecyclerView.LayoutManager?
        get() = null
    override val isShowRecyclerViewDivider: Boolean
        get() = true

    override fun onPullDownToRefresh() {

    }


}

