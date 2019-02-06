package com.rahulkatariya.revelation.application

import com.rahulkatariya.revelation.external.BootstrapService
import com.rahulkatariya.revelationapi.APIMovieProvider
import com.rahulkatariya.revelationapi.RevelationAPI
import com.rahulkatariya.revelationdomain.MovieService
import com.rahulkatariya.revelationdomain.ServiceProvider
import com.rahulkatariya.revelationmock.MockMovieProvider

class AppProvider: ServiceProvider, BootstrapService {
    override val movieService: MovieService = APIMovieProvider()

    override fun bootstrap() {
        RevelationAPI.setup(
            "api.themoviedb.org/3",
            "c3d8a803a729d2f0e663816589397586",
            "en-US"
        )
    }
}
