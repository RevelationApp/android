package com.rahulkatariya.revelationdomain

import io.reactivex.Single

interface MovieService {
    fun fetchAll(): Single<List<Movie>>
}