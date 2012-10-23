package com.fortysevendeg.bbc.patterns.layers.controllers.impl;

import com.fortysevendeg.bbc.patterns.layers.controllers.BarController;
import com.fortysevendeg.bbc.patterns.layers.entity.readonly.BeerReadOnly;
import com.fortysevendeg.bbc.patterns.layers.request.BeerRequest;
import com.fortysevendeg.bbc.patterns.layers.response.BeerResponse;
import com.fortysevendeg.bbc.patterns.layers.services.BarService;

/**
 * The default impl of the bar controller
 */
public class BarControllerImpl implements BarController {

    private BarService barService;

    public BarControllerImpl(BarService barService) {
        this.barService = barService;
    }

    @Override
    public BeerResponse getBeer(String beerId) {
        BeerReadOnly beerReadOnly = barService.getBeer(beerId);
        return new BeerResponse(beerReadOnly);
    }

    @Override
    public BeerResponse addBeer(BeerRequest beerRequest) {
        BeerReadOnly beerReadOnly = barService.addBeer(beerRequest);
        return new BeerResponse(beerReadOnly);
    }


}
