package com.fortysevendeg.bbc.patterns.builder;

import java.util.Date;

/**
 * Builder for cars
 */
public class CarBuilder {

    private Car delegate;

    private Date builtOn;

    public CarBuilder() {
        delegate = new Car();
    }

    public Car build() {
        if (builtOn != null) {
            throw new IllegalStateException("can't call build more than once");
        }
        builtOn = new Date();
        delegate.setBuiltOn(builtOn);
        return delegate;
    }

    public CarBuilder setSportKit(boolean sportKit) {
        delegate.setSportKit(sportKit);
        return this;
    }

    public CarBuilder setTintedGlass(boolean tintedGlass) {
        delegate.setTintedGlass(tintedGlass);
        return this;
    }

    public CarBuilder setElectricBrakes(boolean electricBrakes) {
        delegate.setElectricBrakes(electricBrakes);
        return this;
    }

    public CarBuilder setBrakes(int brakes) {
        delegate.setBrakes(brakes);
        return this;
    }

    public CarBuilder setBuiltOn(Date builtOn) {
        delegate.setBuiltOn(builtOn);
        return this;
    }
}
