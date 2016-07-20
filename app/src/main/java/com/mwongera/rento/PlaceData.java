package com.mwongera.rento;

import java.util.ArrayList;

/**
 * Created by imaya on 7/19/16.
 */
public class PlaceData {
    public static String[] placeNameArray = {"KBC 005G", "KBF 622R", "KBP 295T", "KBS 101V", "KBU 921S", "KBV 121K", "KBW 010K", "KBZ 110E", "KCB 312G", "KCE 069F", "KCF 396E", "KCH 001M"};

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