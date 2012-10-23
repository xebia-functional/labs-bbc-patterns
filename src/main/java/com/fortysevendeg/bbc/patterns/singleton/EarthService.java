package com.fortysevendeg.bbc.patterns.singleton;

/**
 * A singleton example
 */
public class EarthService {

    private final static EarthService instance = new EarthService();

    private EarthService() {
    }

    public final static EarthService getInstance() {
        return instance;
    }
}
