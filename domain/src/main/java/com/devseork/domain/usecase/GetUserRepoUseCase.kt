package com.devseork.domain.usecase

import com.devseork.domain.repository.GithubRepository
import com.devseork.domain.utils.RemoteErrorEmitter
import javax.inject.Inject

/**
 * @author Ha Jin Seok
 * @email seok270@gmail.com
 * @created 2022-04-26
 * @desc
 */
class GetUserRepoUseCase @Inject constructor(
    private val githubRepository: GithubRepository
) {
    suspend fun execute(remoteErrorEmitter: RemoteErrorEmitter, owner : String) = githubRepository.getGithub(remoteErrorEmitter, owner)
}