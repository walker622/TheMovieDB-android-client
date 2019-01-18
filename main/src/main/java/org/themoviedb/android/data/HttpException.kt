package org.themoviedb.android.data

class HttpException(val code: Int, val body: String?) : Throwable()