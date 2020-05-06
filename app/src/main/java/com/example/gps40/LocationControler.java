package com.example.gps40;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;

import java.util.List;

public class LocationControler extends AppCompatActivity {

    private static final int PERMISSION_FINE_LOCATION = 99;
    public TextView  text_addresse;
    TextView ausgabe1;
    public double lathandy;
    public double lonhandy;
    public Switch sw_locationsupdates;

    //wird die location geortet, ja nein?
    boolean updateOn = false;

    //
    LocationRequest locationRequest;
    LocationCallback locationCallBack;


    //Google Application for Location services
    FusedLocationProviderClient fusedLocationProviderClient;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_addresse = findViewById(R.id.text_addresse);
        sw_locationsupdates = findViewById(R.id.sw_locationsupdates);
        ausgabe1 = findViewById(R.id.ausgabe1);


        //Datenliste datenliste = new Datenliste();

        // for(int i=0; i < datenliste.list.size();i++){

        //     ausgabe1.append(datenliste.list.get(i).getName()+ "\n"+ datenliste.list.get(i).getLat()+ "\n"+ datenliste.list.get(i).getLon()+ "\n");

        // }



        //location Einstellungen
        locationRequest = new LocationRequest();
        locationRequest.setInterval(30000);
        locationRequest.setFastestInterval(5000);

        locationRequest.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);

        locationCallBack = new LocationCallback(){


            @Override
            public void onLocationResult(LocationResult locationResult) {
                super.onLocationResult(locationResult);
                Location location = locationResult.getLastLocation();
                updateUIValues(location);
            }
        };


        sw_locationsupdates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sw_locationsupdates.isChecked()){
                    startLocationUpdates();

                }else{
                    stopLocationUpdates();
                }
            }
        });

        updateGPS();
    }

    public void stopLocationUpdates() {


        text_addresse.setText("Aktuelle Aderesse:\nGPS zugriff anschalten");

        fusedLocationProviderClient.removeLocationUpdates(locationCallBack);

    }

    public void startLocationUpdates() {

        fusedLocationProviderClient.requestLocationUpdates(locationRequest, locationCallBack, null);
        updateGPS();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode){
            case PERMISSION_FINE_LOCATION:
                if (grantResults[0]== PackageManager.PERMISSION_GRANTED){
                    updateGPS();
                }
                else {
                    Toast.makeText(this, "Dise App benötigt Ihre Elaubnis über die Benutzung der GPS-Funtkion",Toast.LENGTH_SHORT).show();
                    finish();
                }
                break;
        }
    }

    public void  updateGPS(){
        //Einverständniss vom Benutzer über GPS Nutzung

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(LocationControler.this);

        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED){
            //wenn der Benutzer Erlaubnis erteilt
            fusedLocationProviderClient.getLastLocation().addOnSuccessListener(this, new OnSuccessListener<Location>() {
                @Override
                public void onSuccess(Location location) {
                    //Elaubnis wurde erteilt
                    updateUIValues(location);
                }
            });
        }
        else {
            //Erlaubnis wurde nicht erteilt
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                requestPermissions(new String[] {Manifest.permission.ACCESS_FINE_LOCATION}, PERMISSION_FINE_LOCATION);
            }
        }

    }


    public void updateUIValues(Location location) {
        //Texte werden geupdated.
        this.lathandy = location.getLatitude();
        this.lonhandy = location.getLongitude();
        ausgabe1.setText(String.valueOf(lathandy));
        Geocoder geocoder = new Geocoder(LocationControler.this);
        try {

            List<Address> addresses = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            text_addresse.setText("Aktuelle Aderesse:\n" + addresses.get(0).getAddressLine(0));

        } catch (Exception e) {
            text_addresse.setText("Zur Zeit keine Adresse verfügbar");

        }


    }


    public double getLathandy() {
        return lathandy;
    }

    public double getLonhandy() {
        return lonhandy;
    }
}
