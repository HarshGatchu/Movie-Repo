
package com.ravi.udacity.popularmovies.ui.module;

import com.ravi.udacity.popularmovies.ApplicationModule;
import com.ravi.udacity.popularmovies.ui.fragment.FavoredMoviesFragment;
import com.ravi.udacity.popularmovies.ui.fragment.MovieFragment;
import com.ravi.udacity.popularmovies.ui.fragment.SortedMoviesFragment;

import dagger.Module;

@Module(
        injects = {
                SortedMoviesFragment.class,
                FavoredMoviesFragment.class,
                MovieFragment.class
        },
        addsTo = ApplicationModule.class
)
public final class MoviesModule {}
