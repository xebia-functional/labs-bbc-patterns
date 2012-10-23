package com.fortysevendeg.bbc.patterns.layers.services;

import com.fortysevendeg.bbc.patterns.layers.entity.readonly.BeerReadOnly;
import com.fortysevendeg.bbc.patterns.layers.request.BeerRequest;

/**
 * The bar business service
 */
public interface BarService {

    BeerReadOnly getBeer(String beerId);

    BeerReadOnly addBeer(BeerRequest beerRequest);

}
