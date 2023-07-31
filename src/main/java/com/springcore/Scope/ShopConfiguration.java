package com.springcore.Scope;

import com.springcore.POJOConstructor.Disk;
import com.springcore.POJOConstructor.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springcore.Scope")
public class ShopConfiguration {

    @Bean
    public Product aaa() {
        return new Disk("AAA", 1.5, 700);
    }

    @Bean
    public Product cdrw() {
        return new Disk("CD-RW", 1.5, 700);
    }

    @Bean
    public Product dvdrw() {
        return new Disk("DVD-RW", 3.0, 4900);
    }

}
