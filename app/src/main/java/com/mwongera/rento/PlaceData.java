package com.mwongera.rento;

import java.util.ArrayList;

/**
 * Created by imaya on 7/19/16.
 */
public class PlaceData {
    public static String[] placeNameArray = {"KCF 3969E", "KBF 622R", "KBZ 010K", "KCE 069F", "KCB 312G", "KBP 295T", "KBC 005G", "KBZ 110E", "KBV 921S", "KBS 101V", "KBV 121K", "KCH 001M"};

    public static ArrayList<Place> placeList() {
        ArrayList<Place> list = new ArrayList<>();
        for (int i = 0; i < placeNameArray.length; i++) {
            Place place = new Place();
            place.name = placeNameArray[i];
            place.imageName = placeNameArray[i].replaceAll("\\s+", "").toLowerCase();
            if (i == 2 || i == 5) {
                place.isFav = true;
            }
            list.add(place);
        }
        return (list);
    }
}