package com.rahulkatariya.revelationmock

import io.reactivex.Single
import com.rahulkatariya.revelationdomain.Movie
import com.rahulkatariya.revelationdomain.MovieService

class MockMovieProvider: MovieService {

    override fun fetchAll(): Single<List<com.rahulkatariya.revelationdomain.Movie>> {
        return Single.create<List<Movie>> {
            val movies = listOf(
                Movie(
                    1,
                    "8 Mile"
                ),
                Movie(
                    2,
                    "Southpaw"
                ),
                Movie(
                    3,
                    "Venom"
                )
            )
            it.onSuccess(movies)
        }
    }

}