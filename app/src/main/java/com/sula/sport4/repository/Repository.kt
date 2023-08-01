package com.sula.sport4.repository

import com.google.firebase.firestore.FirebaseFirestore
import com.sula.sport4.data.Resource
import kotlinx.coroutines.tasks.await
import javax.inject.Inject


class Repository @Inject constructor(private val firestore: FirebaseFirestore) {
    suspend fun getLink(): Resource<String> {
        return try {
            Resource.Loading(data = true)
            val linkRef = firestore.collection("links").document("link")
            val linkSnapshot = linkRef.get().await()
            if (linkSnapshot.exists()) {
                Resource.Loading(data = false)
                val link = linkSnapshot.getString("keitaro")
                if (link != null) {
                    Resource.Success(data = link)
                } else {
                    Resource.Error(message = "Link field is empty")
                }
            } else {
                Resource.Loading(data = false)
                Resource.Error(message = "Document not found")
            }
        } catch (ex: Exception) {
            Resource.Error(message = "Exception is $ex")
        }
    }
}