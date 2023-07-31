package com.springcore.Scope;

import com.springcore.POJOConstructor.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ShopConfiguration.class)){

            var aaa = context.getBean("aaa", Product.class);
            var cdrw = context.getBean("cdrw", Product.class);
            var dvdrw = context.getBean("dvdrw", Product.class);

            var cart1 = context.getBean(ShoppingCart.class);
            cart1.addItem(aaa);
            cart1.addItem(cdrw);
            cart1.addItem(dvdrw);

            var cart2 = context.getBean(ShoppingCart.class);
            cart2.addItem(aaa);

            System.out.println(cart1.getItems());
            System.out.println(cart2.getItems());
        }
    }
}
