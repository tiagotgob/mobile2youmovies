package br.com.tgob.mobile2youmovies.service

import br.com.tgob.mobile2youmovies.entity.FilmEntity
import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.QueryName

interface FilmService {
    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") id: Int, @Query ("api_key") apiKey: String) : Call<FilmEntity>
}