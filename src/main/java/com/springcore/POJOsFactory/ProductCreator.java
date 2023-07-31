package com.springcore.POJOsFactory;

import com.springcore.POJOConstructor.Battery;
import com.springcore.POJOConstructor.Disk;
import com.springcore.POJOConstructor.Product;

public class ProductCreator {
    public static Product createProduct(String productId) {
        return switch (productId) {
            case "aaa" -> new Battery("AAA", 2.5, true);
            case "cdrw" -> new Disk("CD-RW", 1.5, 700);
            case "dvdrw" -> new Disk("DVD-RW", 3.0, 4700);
            default -> {
                var msg = "Unknown product '" + productId + "'";
                throw new IllegalArgumentException();
            }
        };
    }
}
