package com.app_knit.base.views.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app_knit.base.R
import com.app_knit.base.repository.models.BlogPostNotification
import com.codingwithmitch.kotlinrecyclerviewexample.models.BlogPost
import kotlinx.android.synthetic.main.row_friendslist.view.*
import kotlinx.android.synthetic.main.row_friendslist.view.txtTvTitle
import kotlinx.android.synthetic.main.row_notificationlist.view.*

class NotificationListAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items: List<BlogPostNotification> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return BlogViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.row_notificationlist, parent, false)
        )

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is BlogViewHolder -> {
                holder.bind(items.get(position))
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }fun submitList(blogList: List<BlogPostNotification>) {
        items = blogList
        notifyDataSetChanged()
    }

    class BlogViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val blog_title = itemView.txtTvTitle
        val blog_loaction = itemView.txTvLocation
        val blog_time = itemView.txTvtime
        fun bind(blogPostNotification: BlogPostNotification) {
            blog_title.setText(blogPostNotification.name)
            blog_loaction.setText(blogPostNotification.loaction)
            blog_time.setText(blogPostNotification.time)
        }
    }


}