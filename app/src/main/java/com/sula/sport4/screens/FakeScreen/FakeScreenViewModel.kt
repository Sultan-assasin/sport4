package com.sula.sport4.screens.FakeScreen

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModel
import com.sula.sport4.data.Resource
import com.sula.sport4.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@RequiresApi(Build.VERSION_CODES.O)
@HiltViewModel
class FakeScreenViewModel @Inject constructor(private val repository: Repository) :ViewModel() {
    var isFirstOpen = true
    suspend fun getLink(): Resource<String> {
        return repository.getLink()
    }
}
