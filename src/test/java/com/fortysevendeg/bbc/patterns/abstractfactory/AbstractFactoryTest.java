package com.fortysevendeg.bbc.patterns.abstractfactory;

import com.fortysevendeg.bbc.patterns.layers.entity.BeerEntity;
import com.fortysevendeg.bbc.patterns.layers.persistence.PersistenceService;
import com.fortysevendeg.bbc.patterns.layers.persistence.impl.PersistenceServiceImpl;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * A simple test for a naive abstract factory
 */
public class AbstractFactoryTest {

    @Test
    @SuppressWarnings("unchecked")
    public void testAbstractFactory() {
        ServiceFactory.putService(PersistenceService.class, new PersistenceServiceImpl<BeerEntity>());
        PersistenceService<BeerEntity> retrievedService = ServiceFactory.getService(PersistenceService.class);
        assertTrue(retrievedService.getClass().equals(PersistenceServiceImpl.class));
    }

}
