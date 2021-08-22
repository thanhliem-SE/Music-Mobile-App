
package com.liem.musicapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class BaiHat implements Serializable {

    @SerializedName("IdBaiHat")
    @Expose
    private String idBaiHat;
    @SerializedName("IdAlbum")
    @Expose
    private String idAlbum;
    @SerializedName("IdPlaylist")
    @Expose
    private String idPlaylist;
    @SerializedName("IdTheLoai")
    @Expose
    private String idTheLoai;
    @SerializedName("TenBaiHat")
    @Expose
    private String tenBaiHat;
    @SerializedName("TenCaSi")
    @Expose
    private String tenCaSi;
    @SerializedName("HinhAnhBaiHat")
    @Expose
    private String hinhAnhBaiHat;
    @SerializedName("LinkBaiHat")
    @Expose
    private String linkBaiHat;

    public String getIdBaiHat() {
        return idBaiHat;
    }

    public void setIdBaiHat(String idBaiHat) {
        this.idBaiHat = idBaiHat;
    }

    public String getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(String idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getIdPlaylist() {
        return idPlaylist;
    }

    public void setIdPlaylist(String idPlaylist) {
        this.idPlaylist = idPlaylist;
    }

    public String getIdTheLoai() {
        return idTheLoai;
    }

    public void setIdTheLoai(String idTheLoai) {
        this.idTheLoai = idTheLoai;
    }

    public String getTenBaiHat() {
        return tenBaiHat;
    }

    public void setTenBaiHat(String tenBaiHat) {
        this.tenBaiHat = tenBaiHat;
    }

    public String getTenCaSi() {
        return tenCaSi;
    }

    public void setTenCaSi(String tenCaSi) {
        this.tenCaSi = tenCaSi;
    }

    public String getHinhAnhBaiHat() {
        return hinhAnhBaiHat;
    }

    public void setHinhAnhBaiHat(String hinhAnhBaiHat) {
        this.hinhAnhBaiHat = hinhAnhBaiHat;
    }

    public String getLinkBaiHat() {
        return linkBaiHat;
    }

    public void setLinkBaiHat(String linkBaiHat) {
        this.linkBaiHat = linkBaiHat;
    }

}