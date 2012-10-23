package com.fortysevendeg.bbc.patterns.singleton;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SingletonTest {

    @Test
    public void testSingleton() {
        Object firstResult = EarthService.getInstance();
        Object secondResult = EarthService.getInstance();
        assertNotNull(firstResult);
        assertNotNull(secondResult);
        assertEquals(firstResult, secondResult);
    }

}
