package com.rahulkatariya.restofire

import okhttp3.OkHttpClient

interface Configurable {
    val configuration: Configuration
        get() = Configuration.getInstance()

    val client: OkHttpClient
        get() = configuration.client

    val scheme: String
        get() = configuration.scheme

    val host: String?
        get() = configuration.host

    val method: String
        get() = configuration.method

    val headers: Map<String, String>?
        get() = configuration.headers

    val queryParameters: Map<String, String>?
        get() = configuration.queryParameters
}