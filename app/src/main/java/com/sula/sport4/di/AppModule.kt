package com.sula.sport4.di

import com.google.firebase.firestore.FirebaseFirestore
import com.sula.sport4.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideFireStore() = FirebaseFirestore.getInstance()


    @Provides
    @Singleton
    fun provideRepository() = Repository(provideFireStore())

}
