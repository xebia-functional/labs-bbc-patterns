package com.fortysevendeg.bbc.patterns.factorymethod;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * A factory method test
 */
public class FactoryMethodTest {

    @Test
    public void testFactoryMethod() {
        Person person = PersonImpl.personWithNameAndAge("test", 100);
        assertEquals(person.getName(), "test");
        assertEquals(person.getAge(), 100);
    }

}
