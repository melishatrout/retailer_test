package com.generic.retailer.model;

import lombok.Builder;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Value
@Builder
public class Book {
    //@Value already marks non-static, package-local fields private.
    String name;
    double price;
    int id;

    private static final List<Book> bookList = new ArrayList<>();

    public void add(Book book) {
        bookList.add(book);
    }

    public Book find(int index) {
        return bookList.get(index);
    }

    public List<Book> findAll() {
        return bookList;
    }
}