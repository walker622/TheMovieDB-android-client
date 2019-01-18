package org.themoviedb.android.feature.movies

import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_movies.*
import org.themoviedb.android.MovieApplication
import org.themoviedb.android.R

class MoviesFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
//        (requireActivity().application as MovieApplication).appComponent().inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_movies, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        container.setOnClickListener { view.findNavController().navigate(R.id.action_movies_to_detailMovieFragment) }
    }

}