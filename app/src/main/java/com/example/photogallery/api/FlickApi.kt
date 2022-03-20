package com.example.photogallery.api

import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi {
    @GET("services/rest/?method=flickr.interestingness.getList" +
    "&api_key=dd82ec268f3b8a3499af0a144d0214a1" + "&format=json" +
            "&nojsoncallback=1" +
            "&extras=url_s"
    )
    fun fetchPhotos(): Call<FlickrResponse>
}