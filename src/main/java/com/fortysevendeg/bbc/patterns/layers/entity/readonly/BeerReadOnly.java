package com.fortysevendeg.bbc.patterns.layers.entity.readonly;

/**
 * A read only façade to a beer
 */
public interface BeerReadOnly {

    String getId();

    String getName();

    String getDescription();

    int getStock();

}
