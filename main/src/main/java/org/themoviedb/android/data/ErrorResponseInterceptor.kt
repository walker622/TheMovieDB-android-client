package org.themoviedb.android.data

import okhttp3.Interceptor
import okhttp3.Response

class ErrorResponseInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val response = chain.proceed(chain.request())
        val body = response.body()
        val code = response.code()
        if (code in 400..500)
            throw HttpException(code, body?.string())
        return response
    }

}