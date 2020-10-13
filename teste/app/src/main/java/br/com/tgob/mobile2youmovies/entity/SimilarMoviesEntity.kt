package br.com.tgob.mobile2youmovies.entity


import com.google.gson.annotations.SerializedName

data class SimilarMoviesEntity(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val results: List<ResultEntity>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)