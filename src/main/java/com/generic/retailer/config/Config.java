package com.generic.retailer.config;

import com.generic.retailer.Database;
import com.generic.retailer.model.Book;
import com.generic.retailer.model.CD;
import com.generic.retailer.model.DVD;
import org.springframework.context.annotation.Bean;

public class Config {

    @Bean("books")
    public Book books() {
        return Book.builder().build();
    }

    @Bean("cds")
    public CD cds() {
        return CD.builder().build();
    }

    @Bean("dvds")
    public DVD dvds() {
        return DVD.builder().build();
    }

    @Bean("data")
    public Database data() {
        return Database.builder().build();
    }
}