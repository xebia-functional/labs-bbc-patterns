package com.fortysevendeg.bbc.patterns.layers.controllers;

import com.fortysevendeg.bbc.patterns.layers.request.BeerRequest;
import com.fortysevendeg.bbc.patterns.layers.response.BeerResponse;

/**
 * A bar controller that handles beer petitions
 */
public interface BarController {

    BeerResponse getBeer(String beerId);

    BeerResponse addBeer(BeerRequest beerRequest);

}
