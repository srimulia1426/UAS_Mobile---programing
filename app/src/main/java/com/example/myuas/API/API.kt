package com.example.myuas.API

import android.text.Editable
import com.example.myuas.Model.CreatePostResponse
import com.example.myuas.Model.PostResponse
import retrofit2.Call
import retrofit2.http.*

interface API {
    //@Get("posts")
    //fun getposts(): call<ArrayList<PostResponse>>

    @GET( "https://jsonplaceholder.typicode.com/posts")
    fun getPosts(
        @Query("userId") userId: Int,
        @Query("id") id :Int): Call<ArrayList<PostResponse>>

    @GET("posts")
    fun getPosts(
        @QueryMap parameters: HashMap<String, String>

    ): Call<ArrayList<PostResponse>>

    @GET
    fun getComments(@Url url: String): Call<ArrayList<CommentResponses>>


    @FormUrlEncoded
    @POST("posts")
    fun createPosts(
        @Field("userId") userId: Int,
        @Field("title") title: String,
        @Field("body") text: String,
    ): Call<CreatePostResponse>

    @FormUrlEncoded
    @PATCH("posts/{id}")
    fun patchPosts(
        @Path("id") id: Editable, //-> untuk url
        @Field("userId") userId: Editable,
        @Field("id") idField: Editable, //-> untuk update
        @Field("title") title: String?,
        @Field("body") text: String?
    ): Call<PostResponse>

    //Delete
    @DELETE("posts/{no}") //value didalam {} harus sama dengan bawahnya
    fun deletePosts(@Path("no") id: Int): Call<Void>
}


