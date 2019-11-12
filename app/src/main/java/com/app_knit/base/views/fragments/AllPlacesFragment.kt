package com.app_knit.base.views.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.app_knit.base.R
import com.app_knit.base.repository.models.DataSourceAllplaces
import com.app_knit.base.viewmodels.BaseViewModel
import com.app_knit.base.views.adapters.AllplacesAdapter

/**
 * A simple [Fragment] subclass.
 */
class AllPlacesFragment : BaseRecyclerViewFragment() {
    override val layoutId: Int
        get() = R.layout.fragment_all_places
    override val viewModel: BaseViewModel?
        get() = null

    override fun setData() {
        val data = DataSourceAllplaces.createdata()
        allplacesAdapter.submitList(data)
    }
        private val allplacesAdapter = AllplacesAdapter()
    override val recyclerViewAdapter: RecyclerView.Adapter<*>?
        get() = allplacesAdapter
    override val layoutManager: RecyclerView.LayoutManager?
        get() = null
    override val isShowRecyclerViewDivider: Boolean
        get() = false

    override fun onPullDownToRefresh() {

    }



}
