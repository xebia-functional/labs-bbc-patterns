package com.fortysevendeg.bbc.patterns.layers;

import com.fortysevendeg.bbc.patterns.layers.controllers.BarController;
import com.fortysevendeg.bbc.patterns.layers.controllers.impl.BarControllerImpl;
import com.fortysevendeg.bbc.patterns.layers.entity.BeerEntity;
import com.fortysevendeg.bbc.patterns.layers.persistence.impl.PersistenceServiceImpl;
import com.fortysevendeg.bbc.patterns.layers.services.impl.BarServiceImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * Sample app context this will usually represent a web service, http url request or any other way
 * in which services and data are organized and ready to serve requests to clients
 */
@SuppressWarnings("unchecked")
public class AppContext {

    private static Map<Class<?>, Object> services = new HashMap<Class<?>, Object>();

    static {
        services.put(BarController.class, new BarControllerImpl(
                new BarServiceImpl(
                        new PersistenceServiceImpl<BeerEntity>()
                )
        ));
    }

    public static  <T> T getService(Class<T> serviceType) {
        return (T) services.get(serviceType);
    }

}
