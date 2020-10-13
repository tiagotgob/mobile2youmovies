package br.com.tgob.mobile2youmovies.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.tgob.mobile2youmovies.R
import br.com.tgob.mobile2youmovies.entity.FilmEntity
import br.com.tgob.mobile2youmovies.service.RetroFitConfig
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val call = RetroFitConfig.getAPI().getMovieDetails(222, "91c42141d6448c36960c2a9907032611")

        call.enqueue(object : Callback<FilmEntity> {
            override fun onResponse(call : Call<FilmEntity>, response: Response<FilmEntity>){
                println(response)
                if(response.code() == 200){
                    val filmEntity = response.body()!!
                    tv_filmTitle.text = filmEntity.title
                }
            }

            override fun onFailure(calll: Call<FilmEntity>, t: Throwable){
                Toast.makeText(this@MainActivity, "Error", Toast.LENGTH_LONG).show()
            }
        })
    }
}

