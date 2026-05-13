package com.pluralsight;

import java.util.ArrayList;

public class AssetApp {
    public static void main(String[] args) {

        ArrayList<Asset> asset = new ArrayList<>();

        ///House creations
        House vacayHouse = new House("Vacation House", "01/01/2020", 450000,
                "121 Wilson St.", 2, 2300, 5000);

        House ownHome = new House("My home", "10/20/2015", 800000,
                "600 River Ridge Blvd", 1, 2000, 8000);


        asset.add(vacayHouse);
        asset.add(ownHome);


    }
}
