package com.springcore.POJOInitializationAndDestruction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShopConfiguration {

    @Bean(initMethod = "openFile", destroyMethod = "closeFile")
    public Cashier cashier() {
        var path = System.getProperty("java.io.tmpdir") + "/cashier";
        return new Cashier("checkout", path);
    }
}
