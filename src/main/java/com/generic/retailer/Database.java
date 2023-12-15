package com.generic.retailer;

import com.generic.retailer.model.Trolley;
import lombok.Builder;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Value
@Builder
public class Database {

    private static final List<Trolley> data = new ArrayList<>();

    public void add(Trolley trolley) {
        data.add(trolley);
    }

    public Trolley find(Integer index) {
        return data.get(index);
    }

    public List<Trolley> findAll() {
        return data;
    }

}