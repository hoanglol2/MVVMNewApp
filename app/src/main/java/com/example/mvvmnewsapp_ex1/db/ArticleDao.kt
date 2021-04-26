package com.example.mvvmnewsapp_ex1.db

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mvvmnewsapp_ex1.model.Article

interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertArticle(article: Article): Long

    @Query("SELECT * FROM articles")
    fun getAllArticle(): LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)
}