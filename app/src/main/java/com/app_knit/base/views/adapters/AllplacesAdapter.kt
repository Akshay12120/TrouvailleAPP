package com.app_knit.base.views.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app_knit.base.R
import com.app_knit.base.repository.models.BlogPostAllPlaces
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.row_all_placeslist.view.*


class AllplacesAdapter :RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    private var items: List<BlogPostAllPlaces> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return Blogviewholder(
                LayoutInflater.from(parent.context).inflate(R.layout.row_all_placeslist, parent, false)
        )
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is Blogviewholder ->{
                holder.bind(items.get(position))
            }
        }
    }

    override fun getItemCount(): Int {
       return items.size
    }
    fun submitList(blogList: List<BlogPostAllPlaces>) {
        items = blogList
        notifyDataSetChanged()
    }
    class Blogviewholder constructor(itemView: View):RecyclerView.ViewHolder(itemView){
        val blog_imag = itemView.iv_image_places
        val blog_name = itemView.txTv_triomphe
        val blog_location = itemView.txTvLocation
        val blog_friendsvisited = itemView.txTv_two_friends
        fun bind(blogPostAllPlaces: BlogPostAllPlaces){
            blog_name.setText(blogPostAllPlaces.name)
            blog_location.setText(blogPostAllPlaces.loaction)
            blog_friendsvisited.setText(blogPostAllPlaces.friends)
            Glide.with(itemView.context)
                    .load(blogPostAllPlaces.imgplace)
                    .placeholder(R.drawable.ic_profile)
                    .into(blog_imag)

        }
    }

}