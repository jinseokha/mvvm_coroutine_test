package com.devseork.domain.utils

/**
 * @author Ha Jin Seok
 * @email seok270@gmail.com
 * @created 2022-04-26
 * @desc
 */
interface RemoteErrorEmitter {
    fun onError(msg: String)
    fun onError(errorType: ErrorType)
}