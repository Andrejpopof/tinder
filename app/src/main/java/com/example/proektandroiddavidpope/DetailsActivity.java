package com.example.proektandroiddavidpope;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;   //kreiranje na recyclerView
    private RecyclerView.Adapter mAdapter;  //gi stava vo recyclerView
    private RecyclerView.LayoutManager mLayoutManager;  //podreduva elementi

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();

        ArrayList<Element> komentari =new ArrayList<>();
        komentari.add(new Element(R.drawable.kd,"You look fly my G"));
        komentari.add(new Element(R.drawable.kuzma,"Bro u the GOAT"));
        komentari.add(new Element(R.drawable.charly,"Seeesh"));
        komentari.add(new Element(R.drawable.lj,"Good luck in the finals my guy"));
        komentari.add(new Element(R.drawable.daisy,"I am just promoting my instagram page"));
        komentari.add(new Element(R.drawable.russ,"bang bang"));
        komentari.add(new Element(R.drawable.klay,"SPLASH BROS U UP ?"));
        komentari.add(new Element(R.drawable.dileta,"I want an interview later pls"));
        komentari.add(new Element(R.drawable.charly,"2020 Champs right here"));
        komentari.add(new Element(R.drawable.russ,"gg ez go next"));
        komentari.add(new Element(R.drawable.lj,"I am old"));


        mRecyclerView=findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager=new LinearLayoutManager(this);
        mAdapter= new ElementAdapter(komentari);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);


    }
}
