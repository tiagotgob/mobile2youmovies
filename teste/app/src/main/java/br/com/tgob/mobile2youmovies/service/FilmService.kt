package br.com.tgob.mobile2youmovies.service

import br.com.tgob.mobile2youmovies.entity.FilmEntity
import br.com.tgob.mobile2youmovies.entity.ResultEntity
import br.com.tgob.mobile2youmovies.entity.SimilarMoviesEntity
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface FilmService {
    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") id: Int, @Query ("api_key") apiKey: String) : Call<FilmEntity>

    @GET("movie/{movie_id}/similar")
    fun getSimilarMovies(@Path("movie_id") id: Int, @Query ("api_key") apiKey: String) : Call<SimilarMoviesEntity>
}