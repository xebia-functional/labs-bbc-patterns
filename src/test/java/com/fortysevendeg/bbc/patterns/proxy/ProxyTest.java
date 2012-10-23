package com.fortysevendeg.bbc.patterns.proxy;

import com.fortysevendeg.bbc.patterns.factorymethod.Person;
import com.fortysevendeg.bbc.patterns.factorymethod.PersonImpl;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Test Proxy
 */
public class ProxyTest {

    @Test
    public void testProxy() {
        Person person = PersonImpl.personWithNameAndAge("test", 100);
        Person proxyPerson = ObjectProxy.newInstance(person, new ObjectProxy.Interceptor() {
            @Override
            public Object around(Object result) {
                System.out.println("Modifying 100 for 200...");
                return 200;
            }
        });
        System.out.println("before getAge is invoked in our test");
        int modifiedAge = proxyPerson.getAge();
        System.out.println("after getAge is invoked in our test");
        assertEquals(modifiedAge, 200);
    }

}
