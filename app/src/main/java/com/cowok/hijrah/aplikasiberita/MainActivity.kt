package com.cowok.hijrah.aplikasiberita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.cowok.hijrah.aplikasiberita.BeritaAdapter.BeritaModel
import com.cowok.hijrah.aplikasiberita.BeritaAdapter.NewsAdapter
import com.cowok.hijrah.aplikasiberita.BeritaAdapter.news
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var newsAdapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        var headline: news?
        if (BeritaModel.newslist.size > 0){
            headline = BeritaModel.newslist[BeritaModel.newslist.size -1]
            tvw_TitleHeadLine.setText(headline.title)
            tvw_DescHeadline.setText(headline.desc)
            img_news0.setImageResource(headline.photo)

            cdv_newsheadline.setOnClickListener {
                val detail_intent = Intent(this, DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.cont_TitleNews, headline.title)
                        putExtra(DetailActivity.cont_KontenNews, headline.desc)
                        putExtra(DetailActivity.cont_PhotoNews, headline.photo.toString())
                    }

                startActivity(detail_intent)
                finish()
            }
        }

        var recyclerView = LinearLayoutManager(this)
        recyclerView.orientation = LinearLayoutManager.VERTICAL
        rcv_daftarberita.layoutManager = recyclerView

        newsAdapter = NewsAdapter(this, BeritaModel.newslist)
        rcv_daftarberita.adapter = newsAdapter

        newsAdapter.setOnClickCallback(object: NewsAdapter.onItemClickCallback{
            override fun onItemClick(data: news) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.cont_TitleNews, data.title)
                        putExtra(DetailActivity.cont_KontenNews, data.desc)
                        putExtra(DetailActivity.cont_PhotoNews, data.photo.toString())
                    }

                startActivity(intent)
                finish()
            }
        })
    }
}