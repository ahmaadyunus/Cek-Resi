package com.example.ahmaadyunus.cekresi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ahmaadyunus on 23/12/16.
 */

public class Riwayat {
    @SerializedName("tanggal")
    @Expose
    private String tanggal;
    @SerializedName("lokasi")
    @Expose
    private String lokasi;
    @SerializedName("keterangan")
    @Expose
    private String keterangan;

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

}
