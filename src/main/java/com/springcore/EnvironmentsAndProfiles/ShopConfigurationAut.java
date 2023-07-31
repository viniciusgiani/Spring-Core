package com.springcore.EnvironmentsAndProfiles;

import com.springcore.POJOConstructor.Battery;
import com.springcore.POJOConstructor.Disk;
import com.springcore.POJOConstructor.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("autumn")
public class ShopConfigurationAut {

    @Bean
    public Product aaa() {
        return new Battery("AAA", 2.5, true);
    }
    @Bean
    public Product cdrw() {
        return new Disk("CD-RW", 1.5, 700);
    }
    @Bean
    public Product dvdrw() {
        return new Disk("DVD-RW", 3.0, 4700);
    }

}
