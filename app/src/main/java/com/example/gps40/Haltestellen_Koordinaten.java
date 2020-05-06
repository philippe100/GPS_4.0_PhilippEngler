package com.example.gps40;


public class Haltestellen_Koordinaten {


    public String name;
    public double latstation;
    public double lonstation;


    public Haltestellen_Koordinaten(String name, double latstation, double lonstation){

        this.name = name;
        this.latstation = latstation;
        this.lonstation = lonstation;

    }

    public double getLat() {
        return latstation;
    }

    public double getLon() {
        return lonstation;
    }

    public String getName() {
        return name;
    }
}
