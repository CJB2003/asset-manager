package com.pluralsight;

import java.util.ArrayList;

public class AssetApp {
    public static void main(String[] args) {

        ArrayList<Asset> asset = new ArrayList<>();

        ///House creations
        House vacayHouse = new House("Vacation House", "01/01/2020", 300000,
                "121 Wilson St.", 2, 2300, 5000);

        House ownHome = new House("My home", "10/20/2015", 500000,
                "600 River Ridge Blvd", 1, 3000, 8000);

        Vehicle dailyVehicle = new Vehicle("Daily Drive", "07/20/2020", 35000,
                "Toyota Tundra", 2020, 100000);

        Vehicle funVehicle = new Vehicle("Street Vehicle", "12/19/2025", 60000,
                "Acura TLX Type S", 2025, 4000);

        asset.add(vacayHouse);
        asset.add(ownHome);
        asset.add(dailyVehicle);
        asset.add(funVehicle);

        for (Asset stuff : asset) {
            System.out.println("Description: " + stuff.getDescription());
            System.out.println("Date acquired: " + stuff.getDateAcquired());
            System.out.println("The original cost: " + stuff.getOriginalCost());
            System.out.println("Current value of asset: " + stuff.getValue());

            if (stuff instanceof House) {
                House aHouse = (House) stuff;
                System.out.println("\nThe house is located in " + aHouse.getAddress() + "\n");
            }
            if (stuff instanceof Vehicle) {
                Vehicle aVehicle = (Vehicle) stuff;
                System.out.println("\nThat vehicle is a " + aVehicle.getMakeModel() + "\n");
            }
        }
    }
}
