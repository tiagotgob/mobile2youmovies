package br.com.tgob.mobile2youmovies.service
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://api.themoviedb.org/3/"

object  RetroFitConfig {

    var retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getFilm(): FilmService {
        return this.retrofit.create(FilmService::class.java)
    }

    fun getListOfSimilarMovies(): FilmService {
        return this.retrofit.create(FilmService::class.java)
    }
}