package com.fortysevendeg.bbc.patterns.layers.services.impl;


import com.fortysevendeg.bbc.patterns.layers.entity.BeerEntity;
import com.fortysevendeg.bbc.patterns.layers.entity.readonly.BeerReadOnly;
import com.fortysevendeg.bbc.patterns.layers.persistence.PersistenceService;
import com.fortysevendeg.bbc.patterns.layers.request.BeerRequest;
import com.fortysevendeg.bbc.patterns.layers.services.BarService;

public class BarServiceImpl implements BarService {

    private PersistenceService<BeerEntity> persistenceService;

    public BarServiceImpl(PersistenceService<BeerEntity> persistenceService) {
        this.persistenceService = persistenceService;
    }

    @Override
    public BeerReadOnly getBeer(String beerId) {
        return persistenceService.get(beerId);
    }

    @Override
    public BeerReadOnly addBeer(BeerRequest beerRequest) {
        BeerEntity beerEntity = BeerEntity.createBeerWithNameAndDescription(beerRequest.getName(), beerRequest.getDescription());
        return persistenceService.save(beerEntity);
    }
}
