package org.themoviedb.android.di

import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import org.themoviedb.android.MovieApplication
import org.themoviedb.android.feature.movies.MoviesFragment
import javax.inject.Singleton
import android.app.Application
import dagger.BindsInstance


@Singleton
@Component(modules = [AndroidInjectionModule::class, NetworkModule::class, ActivityModule::class])
interface ApplicationComponent : AndroidInjector<MovieApplication> {

    override fun inject(instance: MovieApplication)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): ApplicationComponent.Builder

        fun build(): ApplicationComponent

    }
}