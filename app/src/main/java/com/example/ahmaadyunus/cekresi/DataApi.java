package com.example.ahmaadyunus.cekresi;

import com.example.ahmaadyunus.cekresi.Model.JneResi;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ahmaadyunus on 22/12/16.
 */

public interface DataApi {
    @GET("http://ibacor.com/api/cek-resi/?pengirim=JNE&resi=02035015001116&k=9759bc2589ed59f21dca8a67d9365e34")
    Call<JneResi> getData();
}
