package com.generic.retailer.model;


import lombok.Builder;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Value
@Builder
public class CD {

    //@Value already marks non-static, package-local fields private.
    String name;
    double price;
    int id;

    private static final List<CD> cdList = new ArrayList<>();

    public void add(CD cd) {
        cdList.add(cd);
    }

    public CD find(int index) {
        return cdList.get(index);
    }

    public List<CD> findAll() {
        return cdList;
    }
}