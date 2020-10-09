package br.com.tgob.mobile2youmovies.Retrofit

import retrofit2.http.GET

interface FilmService {
    @GET("3/movie/3?api_key=91c42141d6448c36960c2a9907032611&language=en-US")
    fun list()
}