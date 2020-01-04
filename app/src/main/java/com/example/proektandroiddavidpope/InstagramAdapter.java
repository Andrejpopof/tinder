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
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class InstagramAdapter extends RecyclerView.Adapter<InstagramAdapter.InstagramViewHolder> {

    private Context mCtx;
    private ArrayList<Instagram_Class> posts;

    public InstagramAdapter(Context mCtx, ArrayList<Instagram_Class> posts) {
        this.mCtx = mCtx;
        this.posts = posts;
    }

    @NonNull
    @Override
    public InstagramViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_layout,parent,false);
        InstagramViewHolder vh = new InstagramViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull InstagramViewHolder holder, int position) {
        Instagram_Class post = posts.get(position);
        Picasso.get().load(post.getPhoto()).into(holder.photo);
        Picasso.get().load(post.getUserAvatar()).into(holder.userAvatar);
        holder.id.setText(post.getId());
        holder.createdAt.setText(post.getCreatedAt());
        holder.username.setText(post.getUsername());
        holder.likes.setText(post.getLikes());
        holder.comments.setText((CharSequence) post.getComments());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class InstagramViewHolder extends RecyclerView.ViewHolder {

        private ImageView photo,userAvatar;
        private TextView id,createdAt,username,likes,comments;

        public InstagramViewHolder(View itemView) {
            super(itemView);
            comments=(TextView)itemView.findViewById(R.id.Comments);
            photo =(ImageView)itemView.findViewById(R.id.Slika);
            userAvatar = (ImageView) itemView.findViewById(R.id.UserAvatar);
            id = (TextView) itemView.findViewById(R.id.postID);
            createdAt = (TextView) itemView.findViewById(R.id.DatePosted);
            likes = (TextView)itemView.findViewById(R.id.NumberOfLikes);
            username = (TextView) itemView.findViewById(R.id.User);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.getContext().startActivity(new Intent(v.getContext(),DetailsActivity.class));
                }
            });
            photo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.getContext().startActivity(new Intent(v.getContext(),DetailsActivity.class));
                }
            });
        }
    }
}
