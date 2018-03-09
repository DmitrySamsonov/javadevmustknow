package com.ciid.shop.model;

public class Product {

    private final String id;
    private final String name;
    private final String category;

    public Product(String id, String name, String type) {
        this.id = id;
        this.name = name;
        this.category = type;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}