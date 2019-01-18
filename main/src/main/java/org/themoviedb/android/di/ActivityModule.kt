package org.themoviedb.android.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import org.themoviedb.android.feature.entry.EntryActivity

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeEntryActivity(): EntryActivity

}