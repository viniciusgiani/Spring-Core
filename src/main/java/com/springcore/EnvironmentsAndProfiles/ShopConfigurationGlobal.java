package com.springcore.EnvironmentsAndProfiles;

import com.springcore.POJOInitializationAndDestruction.Cashier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springcore.EnvironmentsAndProfiles")
public class ShopConfigurationGlobal {

    @Bean(initMethod = "openFile", destroyMethod = "closeFile")
    public Cashier cashier() {
        var path = System.getProperty("java.io.tmpdir") + "/cashier";
        return new Cashier("checkout", path);
    }
}
