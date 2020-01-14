package com.example.proektandroiddavidpope;

import com.example.proektandroiddavidpope.Models.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
    @GET("posts")
    Call<List<PostModel>> getPosts();
}
