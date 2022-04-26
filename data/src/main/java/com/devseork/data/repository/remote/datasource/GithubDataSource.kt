package com.devseork.data.repository.remote.datasource

import com.devseork.domain.model.GithubResponse
import com.devseork.domain.utils.RemoteErrorEmitter

/**
 * @author Ha Jin Seok
 * @email seok270@gmail.com
 * @created 2022-04-26
 * @desc
 */
interface GithubDataSource {
    suspend fun getGithub(remoteErrorEmitter: RemoteErrorEmitter, owner : String)
    : List<GithubResponse>?

}