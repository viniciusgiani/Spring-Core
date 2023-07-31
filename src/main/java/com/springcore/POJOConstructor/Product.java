package com.springcore.POJOConstructor;

import lombok.Data;

@Data
public abstract class Product {

    private final String name;
    private final double price;

    @Override
    public String toString() {
        return String.format("%s: name=%s, price=$%.2f",
                getClass().getSimpleName(), name, price);
    }
}
