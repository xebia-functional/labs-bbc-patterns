package com.fortysevendeg.bbc.patterns.builder;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * A builder test
 */
public class BuilderTest {

    @Test
    public void testBuilder() {
        Car car = new CarBuilder()
                .setBrakes(1)
                .setElectricBrakes(true)
                .setSportKit(true)
                .build();
        assertEquals(car.getBrakes(), 1);
        assertEquals(car.isElectricBrakes(), true);
        assertEquals(car.isSportKit(), true);
    }

}
