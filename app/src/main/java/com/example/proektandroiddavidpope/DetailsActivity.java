package com.example.proektandroiddavidpope;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;   //kreiranje na recyclerView
    private RecyclerView.Adapter mAdapter;  //gi stava vo recyclerView
    private RecyclerView.LayoutManager mLayoutManager;  //podreduva elementi



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        setTitle("Comments");
        Intent intent = getIntent();



        final ArrayList<Element> komentari =new ArrayList<>();
        komentari.add(new Element(R.drawable.kd,"You look fly my G"));
        komentari.add(new Element(R.drawable.kuzma,"Bro u the GOAT"));
        komentari.add(new Element(R.drawable.charly,"Seeesh"));
        komentari.add(new Element(R.drawable.lj,"Good luck in the finals my guy"));
        komentari.add(new Element(R.drawable.daisy,"I am just promoting my instagram page"));
        komentari.add(new Element(R.drawable.russ,"bang bang"));
        komentari.add(new Element(R.drawable.klay,"splash bros u up ?"));
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
        final EditText editText =(EditText) findViewById(R.id.editText);
        Button btn = (Button) findViewById(R.id.Objavi);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String kom=editText.getText().toString();
                if (kom.length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please insert comment !",Toast.LENGTH_SHORT).show();

                }
                else
                    komentari.add(new Element(R.drawable.lj,kom));
                editText.setText("");
            }
        });
    }
}
