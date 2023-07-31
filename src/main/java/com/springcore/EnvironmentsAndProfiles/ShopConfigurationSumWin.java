package com.springcore.EnvironmentsAndProfiles;

import com.springcore.POJOConstructor.Battery;
import com.springcore.POJOConstructor.Disk;
import com.springcore.POJOConstructor.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({ "summer", "winter" })
public class ShopConfigurationSumWin {

    @Bean
    public Product aaa() {
        return new Battery("AAA", 2.0, true);
    }
    @Bean
    public Product cdrw() {
        return new Disk("CD-RW", 1.0, 700);
    }
    @Bean
    public Product dvdrw() {
        return new Disk("DVD-RW", 2.5, 4700);
    }
}
