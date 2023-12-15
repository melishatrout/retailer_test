package com.generic.retailer.model;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Data
@Builder
@Value
public class Product {
    Integer itemId;
    String productName;
    double price;


}