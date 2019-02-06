package com.rahulkatariya.restofire

import okhttp3.Call
import okhttp3.Callback
import okhttp3.RequestBody
import okhttp3.Response
import java.io.IOException

interface Requestable: _Requestable {

    fun enqueue(
        body: RequestBody? = null,
        completionHandler: ((Response?, IOException?) -> Unit)
    ) {
        val request = asURLRequest(body)
        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                completionHandler(null, e)
            }
            override fun onResponse(call: Call, response: Response) {

                completionHandler(response, null)
            }
        })
    }

}