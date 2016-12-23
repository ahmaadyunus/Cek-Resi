package com.example.ahmaadyunus.cekresi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ahmaadyunus on 23/12/16.
 */

public class Detail {
    @SerializedName("no_resi")
    @Expose
    private String noResi;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("service")
    @Expose
    private String service;
    @SerializedName("tanggal")
    @Expose
    private String tanggal;
    @SerializedName("asal")
    @Expose
    private Asal asal;
    @SerializedName("tujuan")
    @Expose
    private Tujuan tujuan;

    public String getNoResi() {
        return noResi;
    }

    public void setNoResi(String noResi) {
        this.noResi = noResi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public Asal getAsal() {
        return asal;
    }

    public void setAsal(Asal asal) {
        this.asal = asal;
    }

    public Tujuan getTujuan() {
        return tujuan;
    }

    public void setTujuan(Tujuan tujuan) {
        this.tujuan = tujuan;
    }
}
