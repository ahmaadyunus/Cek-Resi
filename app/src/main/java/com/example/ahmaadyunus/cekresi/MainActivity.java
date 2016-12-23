package com.example.ahmaadyunus.cekresi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ahmaadyunus.cekresi.Model.JneResi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    EditText ekspedisi_ET, no_resi_ET;
    TextView tes_tv;
    String ekspedisi, noresi;
    Button cekresi_BTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ekspedisi_ET = (EditText) findViewById(R.id.ekspedisi_ET);
        no_resi_ET = (EditText) findViewById(R.id.no_resi_ET);
        tes_tv = (TextView)findViewById(R.id.tes_tv);

        cekresi_BTN = (Button) findViewById(R.id.cek_btn);
        cekresi_BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cekresi();
            }
        });
    }
    public void cekresi(){
        ekspedisi = ekspedisi_ET.getText().toString();
        noresi = no_resi_ET.getText().toString();
        Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://ibacor.com/api/cek-resi/?pengirim=JNE&resi=02035015001116&k=9759bc2589ed59f21dca8a67d9365e34/")
                //.baseUrl("http://ibacor.com/api/cek-resi?pengirim="+ekspedisi+"&resi="+noresi+"&k=9759bc2589ed59f21dca8a67d9365e34/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        DataApi data_api = retrofit.create(DataApi.class);

        Call<JneResi> call = data_api.getData();
        call.enqueue(new Callback<JneResi>() {

            @Override
            public void onResponse(Call<JneResi> call, Response<JneResi> response) {

               String tes = response.body().getData().getDetail().getAsal().getNama();

                tes_tv.setText(tes);
//                tv_respond.setText(String.valueOf(status));
//                //this extract data from retrofit with for() loop
//                for(Users.UserItem user : response.body().getUsers()) {
//                    tv_result_api.append(
//                            "Id = " + String.valueOf(user.getId()) +
//                                    System.getProperty("line.separator") +
//                                    "Email = " + user.getEmail() +
//                                    System.getProperty("line.separator")
//                    );
//                }
            }


            @Override
            public void onFailure(Call<JneResi> call, Throwable t) {
                Log.d("onFailure", t.toString());
            }
        });

}
}
