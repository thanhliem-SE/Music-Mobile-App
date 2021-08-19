package com.liem.musicapp.adapters;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.liem.musicapp.R;
import com.liem.musicapp.fragments.PlaylistFragment;
import com.liem.musicapp.models.Playlist;
import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class PlaylistRecyclerAdapter extends RecyclerView.Adapter<PlaylistRecyclerAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Playlist> playlists;
    private int totalHeight = 0;
    private RecyclerView recyclerView;


    public PlaylistRecyclerAdapter(Context context, ArrayList<Playlist> playlists, RecyclerView recyclerView) {
        this.context = context;
        this.playlists = playlists;
        this.recyclerView = recyclerView;
    }

    @NonNull
    @NotNull
    @Override
    public PlaylistRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_playlist, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull PlaylistRecyclerAdapter.ViewHolder holder, int position) {
        Playlist playlist = playlists.get(position);
        Picasso.get().load(playlist.getHinhNen()).into(holder.imgBackground);
        Picasso.get().load(playlist.getHinhIcon()).into(holder.imgIcon);
        holder.txtPlaylist.setText(playlist.getTen());

        holder.layout.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);
        int height = holder.layout.getMeasuredHeight();
        totalHeight += height;

        if(position == playlists.size()-1)
            recyclerView.getLayoutParams().height = totalHeight;
    }

    @Override
    public int getItemCount() {
        return playlists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgBackground, imgIcon;
        TextView txtPlaylist;
        ConstraintLayout layout;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            imgBackground = itemView.findViewById(R.id.itemPlaylist_background);
            imgIcon = itemView.findViewById(R.id.itemPlaylist_icon);
            txtPlaylist = itemView.findViewById(R.id.itemPlaylist_txtPlaylist);
            layout = itemView.findViewById(R.id.itemPlaylist_layout);
        }
    }

}
