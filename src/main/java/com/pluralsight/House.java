package com.pluralsight;

public class House extends Asset{

    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    ///Constructor
    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {

        super(description, dateAcquired, originalCost);

        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    ///Overriding getValue method to get price of house
    @Override
    public double getValue() {
        /*
        Initializing a variable price per square ft,
        giving it different values in the switch statement that is dependent on condition
         */
        double pricePerSquareFt = 0;

        switch(this.condition) {
            case 1 -> pricePerSquareFt = 180;
            case 2 -> pricePerSquareFt = 130;
            case 3 -> pricePerSquareFt = 90;
            case 4 -> pricePerSquareFt = 80;
        }

        return (pricePerSquareFt * squareFoot) + (0.25 * this.lotSize);
    }

    ///Getters and setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
}

