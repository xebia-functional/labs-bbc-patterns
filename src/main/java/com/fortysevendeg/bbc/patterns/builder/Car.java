package com.fortysevendeg.bbc.patterns.builder;

import java.util.Date;

/**
 * Represents an object that would be hard to build from a single constructor
 */
public class Car {

    private boolean sportKit;

    private boolean tintedGlass;

    private boolean electricBrakes;

    private int brakes;

    private Date builtOn;

    public boolean isSportKit() {
        return sportKit;
    }

    public void setSportKit(boolean sportKit) {
        this.sportKit = sportKit;
    }

    public boolean isTintedGlass() {
        return tintedGlass;
    }

    public void setTintedGlass(boolean tintedGlass) {
        this.tintedGlass = tintedGlass;
    }

    public boolean isElectricBrakes() {
        return electricBrakes;
    }

    public void setElectricBrakes(boolean electricBrakes) {
        this.electricBrakes = electricBrakes;
    }

    public int getBrakes() {
        return brakes;
    }

    public void setBrakes(int brakes) {
        this.brakes = brakes;
    }

    public Date getBuiltOn() {
        return builtOn;
    }

    public void setBuiltOn(Date builtOn) {
        this.builtOn = builtOn;
    }
}
