package br.com.tgob.mobile2youmovies.service
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://api.themoviedb.org/3/"

object  RetroFitConfig {

    fun getFilm(): FilmService {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(FilmService::class.java)

    }

    fun getListOfSimilarMovies(): SimilarFilmService {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(SimilarFilmService::class.java)

    }

}