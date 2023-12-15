package com.generic.retailer.model;

import lombok.Builder;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Value
@Builder
public class DVD {

    //@Value already marks non-static, package-local fields private.
    String name;
    double price;
    int id;

    private static final List<DVD> dvdList = new ArrayList<>();

    public void add(DVD dvd) {
        dvdList.add(dvd);
    }

    public DVD find(int index) {
        return dvdList.get(index);
    }

    public List<DVD> findAll() {
        return dvdList;
    }
}