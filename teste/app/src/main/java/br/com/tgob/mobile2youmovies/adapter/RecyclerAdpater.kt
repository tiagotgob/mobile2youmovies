package br.com.tgob.mobile2youmovies.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.tgob.mobile2youmovies.R
import br.com.tgob.mobile2youmovies.entity.Result
import br.com.tgob.mobile2youmovies.holder.MyHolder

import kotlinx.android.synthetic.main.rv_filmlist.view.*

class RecyclerAdpater(private val listofRelatedMovies: MutableList<Result>) : RecyclerView.Adapter<MyHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_filmlist, parent, false)
        return MyHolder(view)
    }

    override fun getItemCount() = listofRelatedMovies.size

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
            val litOfRelatedmovies = listofRelatedMovies[position]

            val filmText = holder.itemView.tv_rfilmTitle
            val filmYear = holder.itemView.tv_filmyear
            val category = holder.itemView.tv_category

            filmText.text =  litOfRelatedmovies.title
            filmYear.text = litOfRelatedmovies.releaseDate
            category.text = litOfRelatedmovies.genreIds.toString()
    }

}
