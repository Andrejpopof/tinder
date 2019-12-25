package com.example.proektandroiddavidpope;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.proektandroiddavidpope.R;

import java.util.ArrayList;
import java.util.List;

public class InstagramAdapter extends RecyclerView.Adapter<InstagramAdapter.InstagramViewHolder> {

    private Context mCtx;
    private ArrayList<Instagram_Class> posts;
    private GradientDrawable mGradientDrawable;

    static final String img_key="Image path";

    public InstagramAdapter(Context mCtx, ArrayList<Instagram_Class> posts) {
        this.mCtx = mCtx;
        this.posts = posts;

        mGradientDrawable = new GradientDrawable();
        mGradientDrawable.setColor(Color.GRAY);

        //Make the placeholder same size as the images
        Drawable drawable = ContextCompat.getDrawable
                (mCtx,R.drawable.lebron);
        if(drawable != null) {
            mGradientDrawable.setSize(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @NonNull
    @Override
    public InstagramViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        /**LayoutInflater inflater = LayoutInflater.from(mCtx);
         View view = inflater.inflate(R.layout.list_layout, null);
         InstagramViewHolder holder = new InstagramViewHolder(view);
         return holder;**/
        return new InstagramViewHolder(mCtx, LayoutInflater.from(mCtx).
                inflate(R.layout.list_layout, parent, false), mGradientDrawable);
    }

    @Override
    public void onBindViewHolder(@NonNull InstagramViewHolder holder, int position) {
        Instagram_Class post = posts.get(position);
        holder.bindTo(post);
        /**holder.User.setText(String.valueOf(post.getUser()));
         holder.Description.setText(post.getDescription());
         holder.location.setText(post.getLocation());
         holder.datePosted.setText(String.valueOf(post.getDatePosted()));
         holder.likes.setText(String.valueOf(post.getBrojLajkovi()));

         holder.imageView.setImageResource(R.drawable.charly);**/
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class InstagramViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView User, location, datePosted, likes, Description;
        private Context mContext;
        private Instagram_Class currentpost;
        private GradientDrawable mGradientDrawable;

        public InstagramViewHolder(Context context, View itemView, GradientDrawable gradientDrawable) {
            super(itemView);
            mContext=context;
            imageView =(ImageView)itemView.findViewById(R.id.Slika);
            User = (TextView) itemView.findViewById(R.id.User);
            location = (TextView)itemView.findViewById(R.id.Location);
            datePosted = (TextView)itemView.findViewById(R.id.DatePosted);
            likes = (TextView)itemView.findViewById(R.id.NumberOfLikes);
            Description = (TextView)itemView.findViewById(R.id.Description);
            mGradientDrawable=gradientDrawable;
        }

        public void bindTo(Instagram_Class post) {
            User.setText(post.getUser().getUsername());
            location.setText(post.getLocation());
            datePosted.setText(post.getDatePosted());
            likes.setText(post.getBrojLajkovi());
            Description.setText(post.getDescription());
            currentpost=post;
            imageView.setImageDrawable(mCtx.getResources().getDrawable(currentpost.getImgPath()));
            /**Glide.with(mContext).load(post.
             getImgPath()).placeholder(mGradientDrawable).into(imageView);**/
        }
    }
}
