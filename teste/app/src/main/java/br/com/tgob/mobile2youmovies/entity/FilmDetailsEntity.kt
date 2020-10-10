package br.com.tgob.mobile2youmovies.entity

import com.google.gson.annotations.SerializedName

data class FilmDetailsEntity (
    @SerializedName("original_title") val filmTitle: String,
    @SerializedName("vote_count") val voteCount: String,
    @SerializedName("popularity") val popularity: String,
    @SerializedName("posterPath") val posterPath: String
)
