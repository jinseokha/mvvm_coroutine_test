package com.devseork.data.remote.datasourceImpl

import com.devseork.data.remote.GithubApi
import com.devseork.data.remote.model.GithubResponse
import com.devseork.data.repository.remote.datasource.GithubDataSource
import com.devseork.data.utils.BaseRepository
import com.devseork.domain.utils.RemoteErrorEmitter
import javax.inject.Inject

/**
 * @author Ha Jin Seok
 * @email seok270@gmail.com
 * @created 2022-04-26
 * @desc
 */
class GithubDataSourceImpl @Inject constructor(
    private val githubApi : GithubApi
) : BaseRepository(), GithubDataSource {
    override suspend fun getGithub(
        remoteErrorEmitter: RemoteErrorEmitter,
        owner: String
    ): List<GithubResponse>? {
        return safeApiCall(remoteErrorEmitter){
            githubApi.getRepos(owner).body()
        }
    }
}