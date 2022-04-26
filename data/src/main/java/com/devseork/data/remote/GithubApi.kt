package com.devseork.data.remote


import com.devseork.data.remote.model.GithubResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * @author Ha Jin Seok
 * @email seok270@gmail.com
 * @created 2022-04-26
 * @desc
 */
interface GithubApi {
    @GET("users/{owner}/repos")
    suspend fun getRepos(@Path("owner") owner : String)
            : Response<List<GithubResponse>>
}