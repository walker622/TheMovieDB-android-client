package org.themoviedb.android

import android.app.Activity
import android.app.Application
import androidx.fragment.app.Fragment
import com.squareup.leakcanary.LeakCanary
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.HasActivityInjector
import dagger.android.HasFragmentInjector
import org.themoviedb.android.data.MovieService
import org.themoviedb.android.di.AppModule
import org.themoviedb.android.di.ApplicationComponent
import org.themoviedb.android.di.DaggerApplicationComponent
import timber.log.Timber
import javax.inject.Inject

class MovieApplication : DaggerApplication() {
    private lateinit var applicationComponent: ApplicationComponent

    @Inject
    lateinit var service: MovieService

    override fun onCreate() {
        super.onCreate()
        initTimber()
        initLeakCanary()
    }

    private fun initTimber() {
        if (BuildConfig.DEBUG)
            Timber.plant(Timber.DebugTree())
    }

    private fun initLeakCanary() {
        if (LeakCanary.isInAnalyzerProcess(this))
            return
        LeakCanary.install(this)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent
            .builder()
            .application(this)
            .build()
    }

}