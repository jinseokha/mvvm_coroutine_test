package com.devseork.domain.repository

import com.devseork.domain.model.GithubResponse
import com.devseork.domain.utils.RemoteErrorEmitter

/**
 * @author Ha Jin Seok
 * @email seok270@gmail.com
 * @created 2022-04-26
 * @desc
 */
interface GithubRepository {
    suspend fun getGithub(remoteErrorEmitter: RemoteErrorEmitter, owner : String) : List<GithubResponse>?
}