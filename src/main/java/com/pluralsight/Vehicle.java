package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset{

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);

        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        //Created two variables, one for value reduction and the other for car age
        double valueReduction = 0;
        double carValue = this.originalCost - (this.originalCost * valueReduction);
        int carAge = LocalDate.now().getYear() - this.year;

        if (carAge <= 3) {
            valueReduction = carAge * 0.03;
        } else if (carAge <= 6) {
            valueReduction = carAge * 0.06;
        } else if (carAge <= 10) {
            valueReduction = carAge * 0.08;
        } else {
            return 1000;
        }

        /*
        ONLY reduces an additional 25 percent from the depreciated car value if over 100000
        AND the makeModel is neither Honda nor Toyota
         */
        if (this.odometer > 100000) {
            if (!this.makeModel.toLowerCase().contains("honda") && !this.makeModel.toLowerCase().contains("toyota")) {
                carValue -= carValue * 0.25;
            }
        }
        return carValue;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
