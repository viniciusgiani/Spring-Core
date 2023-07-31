package com.springcore.ExternalData;

import com.springcore.POJOConstructor.Disk;
import com.springcore.POJOConstructor.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.Resource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan("com.springcore")
public class ShopConfiguration {

    @Value("${endofyear.discount=0}")
    private double specialEndofyearDiscountField;

    @Bean
    public static PropertySourcesPlaceholderConfigurer pspc() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public Product dvdrw() {
        return new Disk("DVD-RW", 1.5, 4700);
    }

    @Value("classpath:banner.txt")
    private Resource banner;

    @Bean
    public BannerLoader bannerLoader() {
        return new BannerLoader(banner);

    }
}
