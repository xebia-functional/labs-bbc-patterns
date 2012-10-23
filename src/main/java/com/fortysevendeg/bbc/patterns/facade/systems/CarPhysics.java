package com.fortysevendeg.bbc.patterns.facade.systems;

/**
 * A façade to car related physics
 */
public class CarPhysics {

    private MovingObject movingObject = new MovingObject();

    private SolidObject solidObject = new SolidObject();

    public void run() {
        movingObject.run();
    }

    public int getPosition() {
        return movingObject.getPosition();
    }

    public void collide(CarPhysics other) {
        solidObject.collide(other.solidObject);
    }

    public boolean isDestroyed() {
        return solidObject.isDestroyed();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CarPhysics");
        sb.append("{movingObject=").append(movingObject);
        sb.append(", solidObject=").append(solidObject);
        sb.append('}');
        return sb.toString();
    }
}
