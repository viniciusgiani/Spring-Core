package com.springcore.ExternalData;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

public class Main {
    public static void main(String[] args) throws Exception{
        var resource = new ClassPathResource("application.properties");
        var resource2 = new ClassPathResource("banner.txt");
        var props = PropertiesLoaderUtils.loadProperties(resource);
        var props2 = PropertiesLoaderUtils.loadProperties(resource2);
        System.out.println(props2);
        System.out.println(props);
    }
}
