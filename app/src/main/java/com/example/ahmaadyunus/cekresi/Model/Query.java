package com.example.ahmaadyunus.cekresi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ahmaadyunus on 23/12/16.
 */

public class Query {
    @SerializedName("pengirim")
    @Expose
    private String pengirim;
    @SerializedName("resi")
    @Expose
    private String resi;

    public String getPengirim() {
        return pengirim;
    }

    public void setPengirim(String pengirim) {
        this.pengirim = pengirim;
    }

    public String getResi() {
        return resi;
    }

    public void setResi(String resi) {
        this.resi = resi;
    }
}
