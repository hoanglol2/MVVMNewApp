package com.example.mvvmnewsapp_ex1.api

import com.example.mvvmnewsapp_ex1.model.NewsResponse
import com.example.mvvmnewsapp_ex1.utils.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewAPI {

    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode: String = "us",
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = API_KEY // API_KEY: duoc tao o lop rieng biet cho cac hang so (utils)
    ): Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q")
        searchQuery: String,
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = API_KEY // API_KEY: duoc tao o lop rieng biet cho cac hang so (utils)
    ): Response<NewsResponse>
}

// Tao 1 lop singleton cho phep chung toi thuc hien yeu cau moi noi trong ma cua chung toi