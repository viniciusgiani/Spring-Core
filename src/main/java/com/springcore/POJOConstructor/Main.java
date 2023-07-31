package com.springcore.POJOConstructor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ShopConfiguration.class)){
            var aaa = context.getBean("aaa", Product.class);
            var cdrw = context.getBean("cdrw", Product.class);
            System.out.println(aaa);
            System.out.println(cdrw);
        }
    }
}
