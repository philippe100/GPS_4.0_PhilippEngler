package com.example.gps40;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Datenliste {

   public ArrayList<Haltestellen_Koordinaten> list =new ArrayList<Haltestellen_Koordinaten>();

    public Datenliste(){
        ausfuellen();
    }

    public void ausfuellen(){

        Haltestellen_Koordinaten aachenerStrGuertel = new Haltestellen_Koordinaten("Aachener Str./Gürtel", 50.937562, 6.908607);
        Haltestellen_Koordinaten ackerstr = new Haltestellen_Koordinaten("Ackerstr.", 50.9608618713, 7.0172470209);
        Haltestellen_Koordinaten AdolfMenzelStr = new Haltestellen_Koordinaten("Adolf-Menzel-Str.", 50.8805441765, 7.0155509635);
        Haltestellen_Koordinaten AdrianMellerStr = new Haltestellen_Koordinaten("Adrian-Meller-Str.", 50.9638063880, 6.8302860479);
        Haltestellen_Koordinaten AeltgenDuenwaldStr = new Haltestellen_Koordinaten("Aeltgen-Dünwald-Str.", 51.0035443325, 7.0248157439);
        Haltestellen_Koordinaten Akazienweg = new Haltestellen_Koordinaten("Akazienweg", 50.9603106035, 6.8945909142);
        Haltestellen_Koordinaten AlbinKoebisStr = new Haltestellen_Koordinaten("Albin-Köbis-Str.", 50.8631138621, 7.0933162655);
        Haltestellen_Koordinaten AlfredSchuetteAllee = new Haltestellen_Koordinaten("Alfred-Schütte-Allee", 50.9119246646, 6.9849627371);
        Haltestellen_Koordinaten AlfterAlanusHochschule = new Haltestellen_Koordinaten("Alfter / Alanus Hochschule", 50.7439036465, 7.0166913358);
        Haltestellen_Koordinaten AlteForststr = new Haltestellen_Koordinaten("Alte Forststr.", 50.9153685356, 7.0911163402);
        Haltestellen_Koordinaten AlteRoemerstr = new Haltestellen_Koordinaten("Alte Römerstr.", 51.0567480226, 6.8827798795);
        Haltestellen_Koordinaten AlteStr = new Haltestellen_Koordinaten("Alte Str.", 51.0556096608, 6.8544650006);
        Haltestellen_Koordinaten AlterDeutzerPostweg = new Haltestellen_Koordinaten("Alter Deutzer Postweg", 50.9192049410, 7.0499341836);
        Haltestellen_Koordinaten AlterFlughafenButzweilerhof = new Haltestellen_Koordinaten("Alter Flughafen Butzweilerhof", 50.9774795728, 6.8986242362);
        Haltestellen_Koordinaten AlterMilitaerring = new Haltestellen_Koordinaten("Alter Militärring", 50.9376912853, 6.8818674887);
        Haltestellen_Koordinaten AltonaerPlatz = new Haltestellen_Koordinaten("Altonaer Platz", 50.9938399029, 6.9336706112);
        Haltestellen_Koordinaten AlzeyerStr = new Haltestellen_Koordinaten("Alzeyer Str.", 50.9703527790, 6.9271665925);
        Haltestellen_Koordinaten AmAltenGueterbahnhof = new Haltestellen_Koordinaten("Am Alten Güterbahnhof", 50.9515309902, 6.9039008190);
        Haltestellen_Koordinaten AmBilderstoeckchen = new Haltestellen_Koordinaten("Am Bilderstöckchen", 50.9732971861, 6.9263831940);
        Haltestellen_Koordinaten AmBraunsacker = new Haltestellen_Koordinaten("Am Braunsacker", 51.0118146594, 6.8621229871);
        Haltestellen_Koordinaten AmColoneum = new Haltestellen_Koordinaten("Am Coloneum", 50.9891650589, 6.8919304959);
        Haltestellen_Koordinaten AmEifeltor = new Haltestellen_Koordinaten("Am Eifeltor", 50.8793536452, 6.9171202881);
        Haltestellen_Koordinaten AmEmberg = new Haltestellen_Koordinaten("Am Emberg", 50.9894796017, 7.0303175824);
        Haltestellen_Koordinaten AmFaulbach = new Haltestellen_Koordinaten("Am Faulbach", 50.9794018492, 7.0029760258);
        Haltestellen_Koordinaten AmFeldrain = new Haltestellen_Koordinaten("Am Feldrain", 50.9972088265, 6.9814748987);
        Haltestellen_Koordinaten AmFlachsrosterweg = new Haltestellen_Koordinaten("Am Flachsrosterweg", 50.9835462492, 7.0222828972);
        Haltestellen_Koordinaten AmGrauenStein = new Haltestellen_Koordinaten("Am Grauen Stein", 50.9238377148, 6.9919676735);
        Haltestellen_Koordinaten AmHetzepetsch = new Haltestellen_Koordinaten("Am Hetzepetsch", 51.0143410868, 6.9128171319);
        Haltestellen_Koordinaten AmHochkreuz = new Haltestellen_Koordinaten("Am Hochkreuz", 50.9028552593, 7.0604243764);
        Haltestellen_Koordinaten AmKreuzweg = new Haltestellen_Koordinaten("Am Kreuzweg", 50.8685835551, 6.9216351208);
        Haltestellen_Koordinaten Adolf = new Haltestellen_Koordinaten("Adolf", 9249, 400);


        list.add(aachenerStrGuertel );
        list.add(ackerstr);
        list.add(AdolfMenzelStr);
        list.add(AdrianMellerStr);
        list.add(AeltgenDuenwaldStr);
        list.add(Akazienweg);
        list.add(AlbinKoebisStr);
        list.add(AlfredSchuetteAllee);
        list.add(AlfterAlanusHochschule);
        list.add(AlteForststr);
        list.add(AlteRoemerstr);
        list.add(AlteStr);
        list.add(AlterDeutzerPostweg);
        list.add(AlterFlughafenButzweilerhof);
        list.add(AlterMilitaerring);
        list.add(AltonaerPlatz);
        list.add(AlzeyerStr);
        list.add(AmAltenGueterbahnhof);
        list.add(AmBilderstoeckchen);
        list.add(AmBraunsacker);
        list.add(AmColoneum);
        list.add(AmEifeltor);
        list.add(AmEmberg);
        list.add(AmFaulbach);
        list.add(AmFeldrain);
        list.add(AmFlachsrosterweg);
        list.add(AmGrauenStein);
        list.add(AmHetzepetsch);
        list.add(AmHochkreuz);
        list.add(AmKreuzweg);
        list.add(Adolf);








    }



    public static double distanceInKm(double lat1, double lon1, double lat2, double lon2) {
        int radius = 0;

        double lat = Math.toRadians(lat2 - lat1);
        double lon = Math.toRadians(lon2- lon1);

        double a = Math.sin(lat / 2) * Math.sin(lat / 2) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.sin(lon / 2) * Math.sin(lon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double d = radius * c;

        return Math.abs(d);

    }

    public void berrechnung(){
        String ausgabenhaltestelle1 = "Achner Straße";
        double lat1;
        double lon1;
        double lat2;
        double lon2;

        for(int i=0; i < list.size();i++){





        }

    }


}


