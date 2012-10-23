package com.fortysevendeg.bbc.patterns.facade;

import com.fortysevendeg.bbc.patterns.facade.systems.CarPhysics;
import com.fortysevendeg.bbc.patterns.facade.systems.SolidObject;

/**
 * A car facade
 */
public class Car {

    private CarPhysics carPhysics = new CarPhysics();

    public void run() {
        carPhysics.run();
    }

    public void collide(Car other) {
        carPhysics.collide(other.carPhysics);
    }

    public int getPosition() {
        return carPhysics.getPosition();
    }

    public boolean isDestroyed() {
        return carPhysics.isDestroyed();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Car");
        sb.append("{carPhysics=").append(carPhysics);
        sb.append('}');
        return sb.toString();
    }
}
