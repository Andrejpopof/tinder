package com.example.proektandroiddavidpope;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent intent = getIntent();

        ArrayList<Element> comentari =new ArrayList<>();
        comentari.add(new Element(R.drawable.ic_android_black_24dp,"comment1"));
        comentari.add(new Element(R.drawable.ic_block_black_24dp,"comment2"));
        //POISHE KOMENTARIIIIII

    }
}
