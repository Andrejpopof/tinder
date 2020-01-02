package com.example.proektandroiddavidpope;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ElementAdapter extends RecyclerView.Adapter<ElementAdapter.ElementViewHolder>{
    private ArrayList<Element> mElement;
    public static class ElementViewHolder extends RecyclerView.ViewHolder{

        public ImageView mImageView;
        public TextView mTextView;
        public ImageButton mButton;
        public ElementViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView=itemView.findViewById(R.id.slika);
            mTextView=itemView.findViewById(R.id.komentar);
            mButton=itemView.findViewById(R.id.like);
            
            mButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "You Liked the comment", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    public ElementAdapter(ArrayList<Element> komentari){
        mElement=komentari ;
    }

    @NonNull
    @Override
    public ElementViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View e= LayoutInflater.from(parent.getContext()).inflate(R.layout.element,parent,false);
        ElementViewHolder evh=new ElementViewHolder(e);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ElementViewHolder holder, int position) {
        Element currentItem = mElement.get(position);

        holder.mImageView.setImageResource(currentItem.getmImageResource());
        holder.mTextView.setText(currentItem.getmComment());

    }

    @Override
    public int getItemCount() {
        return mElement.size();
    }
}
