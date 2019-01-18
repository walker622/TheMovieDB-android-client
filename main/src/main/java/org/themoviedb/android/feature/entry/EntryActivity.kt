package org.themoviedb.android.feature.entry

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.plusAssign
import androidx.navigation.ui.setupWithNavController
import dagger.android.DaggerActivity
import kotlinx.android.synthetic.main.activity_entry.*
import org.themoviedb.android.R
import org.themoviedb.android.data.MovieService
import javax.inject.Inject

class EntryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entry)
        bottomNavigationView.setupWithNavController(Navigation.findNavController(this, R.id.mainHostFragment))
    }

}
