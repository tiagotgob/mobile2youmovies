package br.com.tgob.mobile2youmovies.service

import br.com.tgob.mobile2youmovies.dao.FilmDetails
import br.com.tgob.mobile2youmovies.service.Api.Companion.key
import retrofit2.Call
import retrofit2.http.GET

interface FilmService {
    @GET("3/movie/222$key")

    fun getFilmDetails() : Call<List<FilmDetails>>
}