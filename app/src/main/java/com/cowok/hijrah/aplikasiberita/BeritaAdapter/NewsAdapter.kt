package com.cowok.hijrah.aplikasiberita.BeritaAdapter

import android.content.Context
import android.media.browse.MediaBrowser
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cowok.hijrah.aplikasiberita.R
import kotlinx.android.synthetic.main.lay_berita.view.*

class NewsAdapter(val context: Context, val list: List<news>): RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var currenNews: news? = null
        var currenPosition: Int = 0

        fun setData(currennews: news, position: Int){
            itemView.tvw_title.text = currennews!!.title
            itemView.tvw_Desc.text = currennews!!.desc
            itemView.img_news.setImageResource(currennews!!.photo)

            this.currenNews
            this.currenPosition
            
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.lay_berita, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val dataNews = list[position]
        holder.setData(dataNews, position)

        holder.itemView.setOnClickListener() { onItemClickCallBack.onItemClick(list[position]) }
    }

    private lateinit var onItemClickCallBack: onItemClickCallback

    fun setOnClickCallback(onItemCallback: onItemClickCallback){
        this.onItemClickCallBack = onItemCallback
    }

    interface onItemClickCallback{
        fun onItemClick(data: news)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}