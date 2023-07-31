package com.springcore.POJOsFactory;

import com.springcore.POJOConstructor.Battery;
import com.springcore.POJOConstructor.Disk;
import com.springcore.POJOConstructor.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ComponentScan("com.springcore.POJOsFactory")
public class ShopConfiguration2 {

    @Bean
    public ProductCreator2 productCreatorFactory() {
        var products = Map.of(
                "aaa", new Battery("AAA", 2.5, true),
                "cdrw", new Disk("CD-RW", 1.5, 700),
                "dvdrw", new Disk("DVD-RW", 3.0, 4700)
        );
        return new ProductCreator2(products);
    }

    @Bean
    public Product aaa(ProductCreator2 productCreator2) {
        return productCreator2.createProduct("aaa");
    }

    @Bean
    public Product cdrw(ProductCreator2 productCreator2) {
        return productCreator2.createProduct("cdrw");
    }

    @Bean
    public Product dvdrw(ProductCreator2 productCreator2) {
        return productCreator2.createProduct("dvdrw");
    }

}
