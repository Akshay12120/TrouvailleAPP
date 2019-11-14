package com.app_knit.base.views.fragments


import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app_knit.base.R
import com.app_knit.base.repository.models.DataSourceAllplaces
import com.app_knit.base.repository.models.DataSourceLocations
import com.app_knit.base.viewmodels.BaseViewModel
import com.app_knit.base.views.adapters.AllplacesAdapter
import com.app_knit.base.views.adapters.HorizontalRecyclerViewAdapter
import kotlinx.android.synthetic.main.fragment_all_places.*

/**
 * A simple [Fragment] subclass.
 */
class AllPlacesFragment : BaseRecyclerViewFragment() {

    private lateinit var blogAdapter: HorizontalRecyclerViewAdapter

    override val layoutId: Int
        get() = R.layout.fragment_all_places
    override val viewModel: BaseViewModel?
        get() = null

    override fun setData() {

        val data = DataSourceAllplaces.createdata()
        allplacesAdapter.submitList(data)

        initRecyclerView()
        addDataSet()

    }

    private fun addDataSet() {
        val data = DataSourceLocations.createdata()
        blogAdapter.submitList(data)
    }

    private fun initRecyclerView() {
        recyclerView_horizontal.apply {
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            // LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            blogAdapter = HorizontalRecyclerViewAdapter()
            adapter = blogAdapter
        }
        recyclerView_horizontal.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        //blogAdapter = HorizontalRecyclerViewAdapter()
        recyclerView_horizontal.adapter = blogAdapter
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
