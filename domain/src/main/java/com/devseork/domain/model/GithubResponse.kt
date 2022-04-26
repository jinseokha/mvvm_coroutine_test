package com.devseork.domain.model

import com.google.gson.annotations.SerializedName

/**
 * @author Ha Jin Seok
 * @email seok270@gmail.com
 * @created 2022-04-26
 * @desc
 */
data class GithubResponse(
    @SerializedName("name")
    val name: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("created_at")
    val date: String,
    @SerializedName("html_url")
    val url: String
)
