package com.mwongera.rento;

import java.util.ArrayList;

/**
 * Created by imaya on 7/19/16.
 */
public class PlaceData {
    public static String[] placeNameArray = {"KBC_005G", "KBF_622R", "KBP_295T", "KBS_101V", "KBU_921S", "KBV_121K", "KBW_010K", "KBZ_110E", "KCB_312G", "KCE_069F", "KCF_396E", "KCH_001M"};

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