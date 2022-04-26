package com.devseork.data.mapper

import com.devseork.domain.model.GithubResponse

/**
 * @author Ha Jin Seok
 * @email seok270@gmail.com
 * @created 2022-04-26
 * @desc
 */
object Mapper {
    fun mapperGithub(response : List<GithubResponse>?) : List<GithubResponse>? {
        return if (response != null){
            response.toDomain()
        } else null
    }

    fun List<GithubResponse>.toDomain() : List<GithubResponse> {
        return this.map {
            GithubResponse(
                it.name,
                it.id,
                it.date,
                it.url
            )
        }
    }
}