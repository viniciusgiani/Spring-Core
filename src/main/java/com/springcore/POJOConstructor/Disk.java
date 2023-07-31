package com.springcore.POJOConstructor;

import lombok.Getter;

@Getter
public class Disk extends Product {

    private final int capacity;

    public Disk(String name, double price, int capacity) {
        super(name, price);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        var msg = super.toString() + ", capacity=%dMB";
        return String.format(msg, this.capacity);
    }
}
