package com.example.gps40;


public class Haltestellen_Koordinaten {


    private String name;
    private double latstation;
    private double lonstation;
    private int index;
    private double abstand;
    private String link;

    public Haltestellen_Koordinaten(int index, String name, double latstation, double lonstation){

        this.name = name;
        this.latstation = latstation;
        this.lonstation = lonstation;
        this.index = index;
        abstand = 0.0;
        link = "https://www.kvb.koeln/haltestellen/overview/" + index + "/";

    }

    public void setAbstand(double abstand) {
        this.abstand = abstand;
    }

    public double getAbstand() {
        return abstand;
    }

    public String getLink(){return link;}

    public double getLat() {
        return latstation;
    }

    public double getLon() {
        return lonstation;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }
}
