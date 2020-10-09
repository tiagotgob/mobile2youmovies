package br.com.tgob.mobile2youmovies.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetroFitConfig {

    fun init() {
        Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}