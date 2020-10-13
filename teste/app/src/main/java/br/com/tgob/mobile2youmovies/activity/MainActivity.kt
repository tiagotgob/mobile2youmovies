package br.com.tgob.mobile2youmovies.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.tgob.mobile2youmovies.R
import br.com.tgob.mobile2youmovies.entity.FilmEntity
import br.com.tgob.mobile2youmovies.entity.SimilarMoviesEntity
import br.com.tgob.mobile2youmovies.service.RetroFitConfig
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

const val POSTER_BASE_URL =  "https://image.tmdb.org/t/p/w342/or06FN3Dka5tukK1e9sl16pB3iy.jpg"

var isButtonClicked: Boolean = false

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val call2 = RetroFitConfig.getListOfSimilarMovies().getSimilarMovies(299534,"91c42141d6448c36960c2a9907032611")

        call2.enqueue(object : Callback<SimilarMoviesEntity> {
            override fun onResponse(call : Call<SimilarMoviesEntity>, response2: Response<SimilarMoviesEntity>){
                println(response2)
                if(response2.code() == 200){

                    //colocando as repostas
                    val similarMoviesEntity = response2.body()!!

                }
            }
            //lidando com o erro
            override fun onFailure(calll: Call<SimilarMoviesEntity>, t: Throwable){
                Toast.makeText(this@MainActivity, "Error", Toast.LENGTH_LONG).show()
            }
        })


        //chamada do singleDetails
        val call = RetroFitConfig.getFilm().getMovieDetails(299534, "91c42141d6448c36960c2a9907032611")

        call.enqueue(object : Callback<FilmEntity> {
            override fun onResponse(call : Call<FilmEntity>, response: Response<FilmEntity>){
                println(response)
                if(response.code() == 200){

                    //colocando as repostas
                    val filmEntity = response.body()!!
                    tv_filmTitle.text = filmEntity.title
                    tv_voteCount.text = filmEntity.voteCount.toString()
                    tv_Popularity.text = filmEntity.popularity.toString()

                    //carregando o poster
                    if (POSTER_BASE_URL !== null) {
                        Glide.with(this@MainActivity)
                            .load(POSTER_BASE_URL)
                            .into(imv_Poster)
                    } else {
                        imv_Poster.setImageResource(R.drawable.ic_launcher_background)
                    }
                }
            }
                //lidando com o erro
            override fun onFailure(calll: Call<FilmEntity>, t: Throwable){
                Toast.makeText(this@MainActivity, "Error", Toast.LENGTH_LONG).show()
            }
        })

        btn_addfavorite.setOnClickListener() {
            if(!isButtonClicked) { btn_addfavorite.setBackgroundResource(R.drawable.heartfull)
                isButtonClicked = true
            } else{
                btn_addfavorite.setBackgroundResource(R.drawable.heart)
                isButtonClicked = false
            }
        }
    }
}

