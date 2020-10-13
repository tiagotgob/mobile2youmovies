package br.com.tgob.mobile2youmovies.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.tgob.mobile2youmovies.R
import br.com.tgob.mobile2youmovies.entity.SimilarMoviesEntity

class RecyclerAdapter(val context: Context) : RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {

    private var similarMovies : List<SimilarMoviesEntity> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_filmlist,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return similarMovies.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.tv_rfilmTitle.text = similarMovies.get(position).title


//        Glide.with(context).load(similarMovies.get(position).image)
//                .apply(RequestOptions().centerCrop())
//                .into(holder.image)
    }

    fun setSimilarMovie(similarMovie: List<SimilarMoviesEntity>){
        this.similarMovies = similarMovie;
        notifyDataSetChanged()
    }

    class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {

        val tv_rfilmTitle: TextView = itemView!!.findViewById(R.id.title)
    }
}