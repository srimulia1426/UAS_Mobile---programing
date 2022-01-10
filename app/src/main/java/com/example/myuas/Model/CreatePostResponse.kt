package com.example.myuas.Model

import com.google.gson.annotations.SerializedName

data class CreatePostResponse(
    val userId: String?,
    val id: Int,
    val title: String?,
    @SerializedName("body")
    val text: String?
)