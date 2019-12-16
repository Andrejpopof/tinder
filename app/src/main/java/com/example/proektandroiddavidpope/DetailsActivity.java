package com.example.proektandroiddavidpope;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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

        ArrayList<Element> komentari =new ArrayList<>();
        komentari.add(new Element(R.drawable.ic_android_black_24dp,"comment1"));
        komentari.add(new Element(R.drawable.ic_block_black_24dp,"comment2"));



        mRecyclerView=findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager=new LinearLayoutManager(this);
        mAdapter= new ElementAdapter(komentari);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);


    }
}
