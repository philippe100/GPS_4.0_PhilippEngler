package com.example.gps40;

import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    public TextView text_addresse;
    TextView ausgabe1;

    public Switch sw_locationsupdates;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_addresse = findViewById(R.id.text_addresse);
        sw_locationsupdates = findViewById(R.id.sw_locationsupdates);
        ausgabe1 = findViewById(R.id.ausgabe1);

        sw_locationsupdates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sw_locationsupdates.isChecked()){
                    new LocationControler().startLocationUpdates();

                }else{
                   new LocationControler().stopLocationUpdates();
                }
            }
        });

        new LocationControler().updateGPS();
    }



  public static void main(String[] args){
      LocationControler test = new LocationControler();
  }
}
