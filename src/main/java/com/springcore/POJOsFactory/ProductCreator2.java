package com.springcore.POJOsFactory;

import com.springcore.POJOConstructor.Product;
import lombok.AllArgsConstructor;

import java.util.Map;

@AllArgsConstructor
public class ProductCreator2 {

    private final Map<String, Product> productMap;

    public Product createProduct(String productId) {
        Product product = productMap.get(productId);
        if (product != null) {
            return product;
        }
        var msg = "Unknown product '" + productId + "'";
        throw new IllegalArgumentException(msg);
    }
}

