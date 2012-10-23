package com.fortysevendeg.bbc.patterns.facade.systems;

/**
 * Represents a solid body
 */
public class SolidObject {

    private boolean destroyed;

    private int floorDistance = 1;

    public void applyGravity() {
        floorDistance = 0;
    }

    public void collide(SolidObject other) {
        setDestroyed(true);
        if (!other.isDestroyed()) {
            other.collide(this);
        }
    }

    public int getFloorDistance() {
        return floorDistance;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SolidObject");
        sb.append("{destroyed=").append(destroyed);
        sb.append(", floorDistance=").append(floorDistance);
        sb.append('}');
        return sb.toString();
    }
}
