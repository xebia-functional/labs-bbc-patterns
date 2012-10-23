package com.fortysevendeg.bbc.patterns.facade.systems;

/**
 * A moving object
 */
public class MovingObject {

    private int position;

    public void run() {
        position++;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MovingObject");
        sb.append("{position=").append(position);
        sb.append('}');
        return sb.toString();
    }
}
