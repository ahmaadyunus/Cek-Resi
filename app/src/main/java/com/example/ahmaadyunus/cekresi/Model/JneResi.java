package com.example.ahmaadyunus.cekresi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ahmaadyunus on 22/12/16.
 */

public class JneResi {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("pesan")
    @Expose
    private String pesan;
    @SerializedName("query")
    @Expose
    private Query query;
    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("website")
    @Expose
    private String website;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

}
