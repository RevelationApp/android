package com.rahulkatariya.revelationapi

import com.rahulkatariya.restofire.Configuration

object RevelationAPI {
    fun setup(
        host: String,
        apiKey: String,
        language: String
    ) {
        Configuration.getInstance().host = host
        Configuration.getInstance().headers = mapOf(
            "Content-Type" to "application/json"
        )
        Configuration.getInstance().queryParameters = mapOf(
            "api_key" to apiKey,
            "language" to language
        )
    }
}