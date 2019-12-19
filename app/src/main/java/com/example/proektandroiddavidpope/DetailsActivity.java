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
        komentari.add(new Element(R.drawable.kd,"comment1"));
        komentari.add(new Element(R.drawable.kuzma,"comment2"));
        komentari.add(new Element(R.drawable.charly,"comment2"));
        komentari.add(new Element(R.drawable.lj,"comment2"));
        komentari.add(new Element(R.drawable.daisy,"comment2"));
        komentari.add(new Element(R.drawable.russ,"comment2"));
        komentari.add(new Element(R.drawable.klay,"comment2"));
        komentari.add(new Element(R.drawable.dileta,"comment2"));
        komentari.add(new Element(R.drawable.charly,"comment2"));
        komentari.add(new Element(R.drawable.russ,"comment2"));
        komentari.add(new Element(R.drawable.lj,"comment2"));


        mRecyclerView=findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager=new LinearLayoutManager(this);
        mAdapter= new ElementAdapter(komentari);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);


    }
}
