package com.fortysevendeg.bbc.patterns.layers.tests;

import com.fortysevendeg.bbc.patterns.layers.AppContext;
import com.fortysevendeg.bbc.patterns.layers.controllers.BarController;
import com.fortysevendeg.bbc.patterns.layers.request.BeerRequest;
import com.fortysevendeg.bbc.patterns.layers.response.BeerResponse;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Sample layers test
 */
public class LayersTest {

    @Test
    public void testLayers() {
        BeerRequest beerRequest = new BeerRequest();
        beerRequest.setName("cruzcampo");
        beerRequest.setDescription("standard spanish pilsner style beer");
        BarController barController = AppContext.getService(BarController.class);
        BeerResponse firstResponse = barController.addBeer(beerRequest);
        assertNotNull(firstResponse.getId());
        BeerResponse secondResponse = barController.getBeer(firstResponse.getId());
        assertEquals(firstResponse.getId(), secondResponse.getId());
        assertEquals(firstResponse.getName(), secondResponse.getName());
        assertEquals(firstResponse.getDescription(), secondResponse.getDescription());
    }

}
