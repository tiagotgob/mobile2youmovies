package br.com.tgob.mobile2youmovies.dao

import com.google.gson.annotations.SerializedName

data class FilmDetails (
    @SerializedName("original_title") val filmTitle: String,
    @SerializedName("vote_count") val voteCount: String,
    @SerializedName("popularity") val popularity: String,
    @SerializedName("posterPath") val posterPath: String
)
