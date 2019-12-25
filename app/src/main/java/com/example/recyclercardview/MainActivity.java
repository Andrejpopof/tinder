package com.example.recyclercardview;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;

import com.example.proektandroiddavidpope.DetailsActivity;
import com.example.proektandroiddavidpope.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    InstagramAdapter adapter;
    ArrayList<Instagram_Class> posts;

    static final String img_key="Image path";

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
    }
}

/**public void resetInsta(View view){
 initialiseData();
 }**/
