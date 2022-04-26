package com.devseork.githubtest.base

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.devseork.domain.utils.ErrorType
import com.devseork.domain.utils.RemoteErrorEmitter
import com.devseork.githubtest.widget.utils.ScreenState
import com.devseork.githubtest.widget.utils.SingleLiveEvent

/**
 * @author Ha Jin Seok
 * @email seok270@gmail.com
 * @created 2022-04-26
 * @desc
 */
abstract class BaseViewModel : ViewModel(), RemoteErrorEmitter {

    val mutableProgress = MutableLiveData<Int>(View.GONE)
    val mutableScreenState = SingleLiveEvent<ScreenState>()
    val mutableErrorMessage = SingleLiveEvent<String>()
    val mutableSuccessMessage = MutableLiveData<String>()
    val mutableErrorType = SingleLiveEvent<ErrorType>()


    override fun onError(errorType: ErrorType) {
        mutableErrorType.postValue(errorType)
    }

    override fun onError(msg: String) {
        mutableErrorMessage.postValue(msg)
    }
}