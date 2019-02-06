package com.rahulkatariya.revelationdomain

//import java.net.URL

data class Movie(val id: Int, val title: String) {
    var detail: MovieDetail? = null
}

class MovieDetail {
    var imdbId: String? = null
}
