package com.springcore.POJOsFactory;

import com.springcore.POJOConstructor.Battery;
import com.springcore.POJOConstructor.Disk;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springcore.POJOsFactory")
public class ShopConfiguration3 {

    @Bean
    public Battery aaa() {
        return new Battery("AAA", 2.5, true);
    }

    @Bean
    public Disk cdrw() {
        return new Disk("CD-RW", 1.5, 700);
    }
    @Bean
    public DiscountFactoryBean discountFactoryBeanAAA(Battery aaa) {
        var factory = new DiscountFactoryBean();
        factory.setProduct(aaa);
        factory.setDiscount(0.2);
        return factory;
    }
    @Bean
    public DiscountFactoryBean discountFactoryBeanCDRW(Disk cdrw) {
        var factory = new DiscountFactoryBean();
        factory.setProduct(cdrw);
        factory.setDiscount(0.1);
        return factory;
    }

    @Bean
    public DiscountFactoryBean discountFactoryBeanDVDRW(Disk dvdrw) {
        var factory = new DiscountFactoryBean();
        factory.setProduct(dvdrw);
        factory.setDiscount(0.1);
        return factory;
    }
}

