package com.example.ahmaadyunus.cekresi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ahmaadyunus on 23/12/16.
 */

public class Data {
    @SerializedName("detail")
    @Expose
    private Detail detail;
    @SerializedName("riwayat")
    @Expose
    private List<Riwayat> riwayat = null;

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public List<Riwayat> getRiwayat() {
        return riwayat;
    }

    public void setRiwayat(List<Riwayat> riwayat) {
        this.riwayat = riwayat;
    }
}
