package com.fortysevendeg.bbc.patterns.abstractfactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Naive impl of an abstract generic bean factory
 */
@SuppressWarnings("unchecked")
public class ServiceFactory {

    private static Map<Class<?>, Object> services = new HashMap<Class<?>, Object>();

    public static  <T> T getService(Class<T> serviceType) {
        return (T) services.get(serviceType);
    }

    public static  <T, V extends T> T putService(Class<T> serviceType, V service) {
        return (T) services.put(serviceType, service);
    }

}
