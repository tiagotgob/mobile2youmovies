package br.com.tgob.mobile2youmovies.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.tgob.mobile2youmovies.R
import br.com.tgob.mobile2youmovies.entity.ResultEntity
import br.com.tgob.mobile2youmovies.holder.MyHolder
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.adapter_similar_movie.view.*

class SImilarMovieAdapter(private var listOfRelatedMovies: List<ResultEntity>) : RecyclerView.Adapter<MyHolder>() {

    private lateinit var context : Context

    fun setList(list: List<ResultEntity>){
        this.listOfRelatedMovies = list
        this.notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        context = parent.context
        return MyHolder(LayoutInflater.from(context).inflate(R.layout.adapter_similar_movie, parent, false))
    }

    override fun getItemCount(): Int  {
        return listOfRelatedMovies.size
    }

        override fun onBindViewHolder(holder: MyHolder, position: Int) {
            val list = listOfRelatedMovies[position]

            val filmText = holder.itemView.tv_rfilmTitle
            val filmYear = holder.itemView.tv_filmyear
            val category = holder.itemView.tv_category
            val filmposter = holder.itemView.imv_relatedfilmlistimg
            val poster = "https://image.tmdb.org/t/p/w185"+list.posterPath

           Glide.with(context).load(poster).into(filmposter)

            filmText.text =  list.title
            filmYear.text = list.releaseDate
            category.text = list.genreIds.toString()
        }
}

