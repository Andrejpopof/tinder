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
        /**String[] locations = getResources().getStringArray(R.array.Locations);
         String[] descriptions = getResources().getStringArray(R.array.Descriptions);
         String[] dates = getResources().getStringArray(R.array.dates);
         String[] numberoflikes = getResources().getStringArray(R.array.Likes);
         String[] usernames = getResources().getStringArray(R.array.Usernames);
         TypedArray instaimages = getResources().obtainTypedArray(R.array.images);
         //user.getUsername().equals(usernames);**/

        /**ArrayList<Instagram_Class> listOfPosts = new ArrayList<>();**/
        Users user1 = new Users("KingJames", "Lebron James");
        Users user2 = new Users("kyrieirving", "Kyrie Irving");
        Users user3 = new Users("russwest44", "Russell Westbrook");

        Instagram_Class post1 = new Instagram_Class(R.drawable.lebron, "8 524 350", "I am the GOAT", "20.11.2019", user1, "Staples Center - Los Angeles California");
        Instagram_Class post2 = new Instagram_Class(R.drawable.kyrie, "3 254 558", "Crossover city", "20.11.2019", user2, "Brooklyn - New York");
        Instagram_Class post3 = new Instagram_Class(R.drawable.russ, "7 254 558", "Bullyball", "20.11.2019", user3, "Houston - Texas");
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        /**posts.clear();**/

        /**for(int i=0;i<descriptions.length;i++){
         // String[] usernames=user.getUsername();
         posts.add(new Instagram_Class(instaimages.getResourceId(i,0),numberoflikes[i],descriptions[i],dates[i],usernames[i],locations[i]));
         }**/
        /**instaimages.recycle();**/
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
                List<PostModel> posts =response.body();
                List<CommentModel> comments;
                for(PostModel post : posts){
                    //SAMO TUKA NAPOLNI GI POSTOVITE (NASHMINKAJ GO POSTOT I KORISTI ISTI INFORMACII KO SO SE DADENI OD NEA NA SERVEROT SO ISTI TIPOVI NA PROMENLIVI)
                    //AKO PROBAS DA JA RUNNES KE PUKNE RADI OVOJ DEL SO NE E DOVRSEN OD RETROFITOT NADOLE <3
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
