package com.springcore.EnvironmentsAndProfiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("winter");
        context.register(ShopConfigurationGlobal.class);
        context.refresh();
    }
}
