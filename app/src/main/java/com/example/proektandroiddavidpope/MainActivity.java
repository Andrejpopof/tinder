package com.example.proektandroiddavidpope;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.proektandroiddavidpope.Models.CommentModel;
import com.example.proektandroiddavidpope.Models.PostModel;
import com.example.proektandroiddavidpope.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    InstagramAdapter adapter;
    ArrayList<Instagram_Class> posts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        posts = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.rView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        adapter = new InstagramAdapter(this, posts);
        recyclerView.setAdapter(adapter);
        initialiseData();
    }

    private void initialiseData() {
        adapter.notifyDataSetChanged();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://5ddfd7adbb46ce001434bca8.mockapi.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        JsonPlaceHolderApi jsonPlaceHolderApi =retrofit.create(JsonPlaceHolderApi.class);
        Call<List<PostModel>> call= jsonPlaceHolderApi.getPosts();

        call.enqueue(new Callback<List<PostModel>>() {
            @Override
            public void onResponse(Call<List<PostModel>> call, Response<List<PostModel>> response) {
                List<PostModel> postsmodels = response.body();
                List<CommentModel> comments;
                String komentari[];
                for(PostModel post : postsmodels){
                    comments = post.getComments();
                    for(CommentModel komentar:comments){
                        /**for(int i=0;i<comments.size();i++){
                            komentari[i] = String.valueOf(komentar.getComment());
                        }**/
                        Instagram_Class post1 = new Instagram_Class(post.getId(),post.getCreatedAt(),post.getPhoto(),post.getUserAvatar(),post.getUserName(),post.getLikes(),komentar.getComment());
                        posts.add(post1);
                    }
                }
            }
            @Override
            public void onFailure(Call<List<PostModel>> call, Throwable t) {
            }
        });
    }

}

/**public void resetInsta(View view){
 initialiseData();
 }**/
