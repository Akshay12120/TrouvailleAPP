package com.app_knit.base.views.fragments


import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.app_knit.base.R
import com.app_knit.base.repository.models.DataSource
import com.app_knit.base.viewmodels.BaseViewModel
import com.app_knit.base.views.adapters.FriendListAdapter

/**
 * A simple [Fragment] subclass.
 */
class ContactsFragment : BaseRecyclerViewFragment() {
    override val layoutId: Int
        get() = R.layout.fragment_friends
    override val viewModel: BaseViewModel?
        get() = null


    override fun setData() {
        val data = DataSource.createDataset()
        friendlistadapter.submitList(data)
    }

    private val friendlistadapter = FriendListAdapter()

    override val recyclerViewAdapter: RecyclerView.Adapter<*>?
        get() = friendlistadapter
    override val layoutManager: RecyclerView.LayoutManager?
        get() = null
    override val isShowRecyclerViewDivider: Boolean
        get() = true

    override fun onPullDownToRefresh() {

    }
}

