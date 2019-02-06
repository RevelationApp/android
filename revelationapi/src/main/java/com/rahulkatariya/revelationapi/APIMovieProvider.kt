package com.rahulkatariya.revelationapi

import io.reactivex.Single
import com.rahulkatariya.revelationdomain.Movie
import com.rahulkatariya.revelationdomain.MovieService

class APIMovieProvider: MovieService {

    override fun fetchAll(): Single<List<Movie>> {
        return Single.create<List<Movie>> {
            val movies = listOf(
                            Movie(
                            1,
                            "API 8 Mile"
                        ),
                        Movie(
                            2,
                            "API Southpaw"
                        ),
                        Movie(
                            3,
                            "API Venom"
                        )
                    )
                    it.onSuccess(movies)
//            DiscoverMovieGETService()
//                .enqueue(null) { response, _ ->
//                    println(response?.body()?.string())
//
//                }
        }
    }

}