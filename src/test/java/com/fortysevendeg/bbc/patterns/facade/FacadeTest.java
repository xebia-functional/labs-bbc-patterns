package com.fortysevendeg.bbc.patterns.facade;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * A simple Facade test
 */
public class FacadeTest {

    @Test
    public void testFacade() {
        Car facade1 = new Car();
        Car facade2 = new Car();
        assertEquals(facade1.getPosition(), facade2.getPosition());
        assertEquals(facade1.isDestroyed(), false);
        facade1.run();
        facade2.run();
        facade1.collide(facade2);
        assertEquals(facade1.isDestroyed(), true);
        assertEquals(facade1.getPosition(), facade2.getPosition());
        assertEquals(facade1.isDestroyed(), facade2.isDestroyed());
    }

}
