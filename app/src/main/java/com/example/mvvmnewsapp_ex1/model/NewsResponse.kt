package com.example.mvvmnewsapp_ex1.model

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)