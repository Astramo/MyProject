package com.example.myproject.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myproject.models.HomeModel
import com.example.myproject.models.server_side.ServerModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.BehaviorSubject

class HomeViewModel : ViewModel() {

    private val homeModel: HomeModel = HomeModel()
    var isLoaded: BehaviorSubject<Boolean> = BehaviorSubject.createDefault(false)
    private var data: MutableLiveData<List<ServerModel>>? = null


    fun observerData(): MutableLiveData<List<ServerModel>> {
        if (data == null) {
            data = MutableLiveData()
            getData()
        }

        return data as MutableLiveData<List<ServerModel>>
    }

    private fun getData() {
        isLoaded.onNext(false)
        homeModel.getData().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doFinally { isLoaded.onNext(true) }
            .subscribe({ serverData ->
                data?.value = serverData
                Log.i(TAG, "getData: $data")
            }, { e ->
                Log.e(TAG, "getData: ", e)
            }).isDisposed
    }

    companion object {
        private const val TAG = "HomeViewModel"
    }

}