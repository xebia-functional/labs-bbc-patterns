package com.fortysevendeg.bbc.patterns.layers.entity;

import com.fortysevendeg.bbc.patterns.layers.entity.readonly.BeerReadOnly;

/**
 * A Beer model entity
 */
public class BeerEntity implements Persistent, BeerReadOnly {

    private String id;

    private String name;

    private String description;

    private int stock;

    public static BeerEntity createBeerWithNameAndDescription(String name, String description) {
        BeerEntity entity = new BeerEntity();
        entity.setName(name);
        entity.setDescription(description);
        return entity;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BeerEntity that = (BeerEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
