package com.liem.musicapp.services;

import com.liem.musicapp.models.Playlist;
import com.liem.musicapp.models.QuangCao;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DataService {

    @GET("bai-hat-banner.php")
    Call<List<QuangCao>> getDataBanner();

    @GET("playlist.php")
    Call<List<Playlist>> getPlaylist();
}
