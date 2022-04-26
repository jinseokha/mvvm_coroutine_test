package com.devseork.data.repository

import com.devseork.data.mapper.Mapper
import com.devseork.domain.utils.RemoteErrorEmitter
import com.devseork.data.repository.remote.datasource.GithubDataSource
import com.devseork.domain.model.GithubResponse
import com.devseork.domain.repository.GithubRepository

import javax.inject.Inject

/**
 * @author Ha Jin Seok
 * @email seok270@gmail.com
 * @created 2022-04-26
 * @desc
 */
class GithubRepositoryImpl @Inject constructor(
    private val githubDataSource : GithubDataSource
) : GithubRepository {
    override suspend fun getGithub(
        remoteErrorEmitter: RemoteErrorEmitter,
        owner: String
    ): List<GithubResponse>? {
        return Mapper.mapperGithub(githubDataSource.getGithub(remoteErrorEmitter, owner))
    }