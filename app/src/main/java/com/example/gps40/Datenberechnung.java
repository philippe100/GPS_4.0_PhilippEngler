package com.example.gps40;

import java.io.IOException;
import java.util.ArrayList;

public class Datenberechnung {

    private ArrayList<Haltestellen_Koordinaten> list =new ArrayList<Haltestellen_Koordinaten>();
    private CreateListe csv;

    public Datenberechnung() throws IOException {
        csv = new CreateListe();
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

    public Haltestellen_Koordinaten[] berechnung(double lat1, double lon1){
        Haltestellen_Koordinaten[] groesste = new Haltestellen_Koordinaten[10];
        Haltestellen_Koordinaten tmp = list.get(0);
        groesste[0] = tmp;
        groesste[1] = tmp;
        groesste[2] = tmp;
        groesste[3] = tmp;
        groesste[4] = tmp;
        groesste[5] = tmp;
        groesste[6] = tmp;
        groesste[7] = tmp;
        groesste[8] = tmp;
        groesste[9] = tmp;


        groesste[0].setAbstand(distanceInKm(lat1, lon1, tmp.getLat(), tmp.getLon()));
        for(int i=0; i < list.size(); i++) {
            tmp = list.get(i);
            tmp.setAbstand(distanceInKm(lat1, lon1, tmp.getLat(), tmp.getLon()));
            if (tmp.getAbstand() < groesste[0].getAbstand()) {
                groesste[9] = groesste[8];
                groesste[8] = groesste[7];
                groesste[7] = groesste[6];
                groesste[6] = groesste[5];
                groesste[5] = groesste[4];
                groesste[4] = groesste[3];
                groesste[3] = groesste[2];
                groesste[2] = groesste[1];
                groesste[1] = groesste[0];
                groesste[0] = tmp;
            }else if (tmp.getAbstand() < groesste[1].getAbstand()) {
                groesste[9] = groesste[8];
                groesste[8] = groesste[7];
                groesste[7] = groesste[6];
                groesste[6] = groesste[5];
                groesste[5] = groesste[4];
                groesste[4] = groesste[3];
                groesste[3] = groesste[2];
                groesste[2] = groesste[1];
                groesste[1] = tmp;
            } else if (tmp.getAbstand() < groesste[2].getAbstand()) {
                groesste[9] = groesste[8];
                groesste[8] = groesste[7];
                groesste[7] = groesste[6];
                groesste[6] = groesste[5];
                groesste[5] = groesste[4];
                groesste[4] = groesste[3];
                groesste[3] = groesste[2];
                groesste[2] = tmp;
            }else if (tmp.getAbstand() < groesste[3].getAbstand()) {
                groesste[9] = groesste[8];
                groesste[8] = groesste[7];
                groesste[7] = groesste[6];
                groesste[6] = groesste[5];
                groesste[5] = groesste[4];
                groesste[4] = groesste[3];
                groesste[3] = tmp;
            }else if (tmp.getAbstand() < groesste[4].getAbstand()) {
                groesste[9] = groesste[8];
                groesste[8] = groesste[7];
                groesste[7] = groesste[6];
                groesste[6] = groesste[5];
                groesste[5] = groesste[4];
                groesste[4] = tmp;
            }else if (tmp.getAbstand() < groesste[5].getAbstand()) {
                groesste[9] = groesste[8];
                groesste[8] = groesste[7];
                groesste[7] = groesste[6];
                groesste[6] = groesste[5];
                groesste[5] = tmp;

            } else if (tmp.getAbstand() < groesste[6].getAbstand()) {
                groesste[9] = groesste[8];
                groesste[8] = groesste[7];
                groesste[7] = groesste[6];
                groesste[6] = tmp;

            }else if (tmp.getAbstand() < groesste[7].getAbstand()) {
                groesste[9] = groesste[8];
                groesste[8] = groesste[7];
                groesste[7] = tmp;

            }else if (tmp.getAbstand() < groesste[8].getAbstand()) {
                groesste[9] = groesste[8];
                groesste[8] = tmp;

            }else if (tmp.getAbstand() < groesste[9].getAbstand()) {
                groesste[9] = tmp;
            }

        }
        return groesste;
    }

}


