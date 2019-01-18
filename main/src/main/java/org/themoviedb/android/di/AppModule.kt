package org.themoviedb.android.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import org.themoviedb.android.feature.entry.EntryActivity
import javax.inject.Singleton

@Module
class AppModule(private val context: Context) {

    @Singleton
    @Provides
    fun provideApplicationContext() = context

}