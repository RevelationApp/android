package com.rahulkatariya.revelation.router

import com.rahulkatariya.revelationdomain.ServiceProvider

class MovieRouter {

    val appService: ServiceProvider

    constructor(appService: ServiceProvider) {
        this.appService = appService
    }

}