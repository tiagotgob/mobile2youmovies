package br.com.tgob.mobile2youmovies.service

import android.widget.Toast
import br.com.tgob.mobile2youmovies.entity.FilmEntity
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

const val API_KEY = "91c42141d6448c36960c2a9907032611"
const val BASE_URL = "https://api.themoviedb.org/3/"
const val POSTER_BASE_URL =  "https://image.tmdb.org/t/p/w342"

object  RetroFitConfig {

    fun getAPI(): FilmService {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(FilmService::class.java)

    }

}