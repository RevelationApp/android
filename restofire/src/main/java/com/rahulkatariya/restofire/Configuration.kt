package com.rahulkatariya.restofire

import okhttp3.*

class Configuration {

    companion object {
        @Volatile private var INSTANCE: Configuration ? = null
        fun getInstance(): Configuration {
            return INSTANCE?: synchronized(this){
                Configuration().also {
                    INSTANCE = it
                }
            }
        }
    }

    var host: String? = null
    var scheme: String = "https"
    var method: String = "GET"
    var headers: Map<String, String>? = null
    var queryParameters: Map<String, String>? = null
    var client: OkHttpClient = OkHttpClient()
}
