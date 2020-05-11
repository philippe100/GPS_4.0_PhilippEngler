package com.example.gps40;

import java.io.IOException;
import java.util.ArrayList;

public class Datenliste {

    private ArrayList<Haltestellen_Koordinaten> list =new ArrayList<Haltestellen_Koordinaten>();
    private GetCSV csv;

    public Datenliste() throws IOException {
        csv = new GetCSV();
        ausfuellen();
    }

    /*
    Holt sich die CSV Datei von der Website und geht diese durch, jede Haltestelle wird nur einmal angelegt.
    **/
    public void ausfuellen() throws IOException {
        list = csv.formatCSV();
    }


    public String getList(){
        String tmp = "";
        for(int i = 0; i<list.size(); i++)
        {
            tmp += list.get(i).getName() + "\n";
        }
        return tmp;
    }


    public  double distanceInKm(double lat1, double lon1, double lat2, double lon2) {
        final int R = 6371; // Radius of the earth

        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c; // convert to meters


        distance = Math.pow(distance, 2);

        return Math.sqrt(distance);
    }

    public String berechnung(double lat1, double lon1){
        System.out.println("" + Double.toString(lat1) + "\n" + Double.toString(lon1) );
        Haltestellen_Koordinaten tmp = list.get(0);
        Haltestellen_Koordinaten nearest = tmp;
        double tmpD = distanceInKm(lat1, lon1, tmp.getLat(), tmp.getLon());
        System.out.println(", " + tmpD);
        for(int i=0; i < list.size(); i++){
            System.out.println("" + Double.toString(lat1) + "  " + Double.toString(lon1) + "\n" + tmp.getName() + "  " + Double.toString(tmp.getLat()) + "  " + Double.toString(tmp.getLon()));
            tmp = list.get(i);
            if(distanceInKm(lat1, lon1, tmp.getLat(), tmp.getLon()) < tmpD){
                tmpD = distanceInKm(lat1, lon1, tmp.getLat(), tmp.getLon());
                nearest = tmp;
            }
        }
        return nearest.getName();
    }



}


