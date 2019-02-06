package com.rahulkatariya.restofire

import okhttp3.HttpUrl
import okhttp3.Request
import okhttp3.RequestBody

interface _Requestable: Configurable {
    val path: String

    fun asURLRequest(body: RequestBody? = null): Request {
        if (host == null) throw NullPointerException("host == null")
        if (host?.length == 0) throw IllegalArgumentException("host.length == 0")

        val url = HttpUrl.parse("$scheme://$host/$path")!!.newBuilder()

        queryParameters?.forEach {
            url.addQueryParameter(it.key, it.value)
        }

        val requestBuilder = Request.Builder()
            .url(url.build())
            .method(method, body)

        headers?.forEach {
            requestBuilder.addHeader(it.key, it.value)
        }

        return requestBuilder.build()
    }
}