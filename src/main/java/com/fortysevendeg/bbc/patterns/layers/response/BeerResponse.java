package com.fortysevendeg.bbc.patterns.layers.response;

import com.fortysevendeg.bbc.patterns.layers.entity.readonly.BeerReadOnly;

/**
 * A beer resulting object that is serialized or forwarded as a view model.
 * Exposed through a lazy delegate only the methods needed in the view or response are exposed
 * In this case getStock() is purposely omitted
 */
public class BeerResponse {

    private BeerReadOnly delegate;

    public BeerResponse(BeerReadOnly delegate) {
        this.delegate = delegate;
    }

    public String getId() {
        return delegate.getId();
    }

    public String getName() {
        return delegate.getName();
    }

    public String getDescription() {
        return delegate.getDescription();
    }
}
