package com.springcore.POJOsAwareness;

import lombok.Data;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Bean;

@Data
public class Cashier implements BeanNameAware {
    private final String path;
    private String fileName;
    @Override
    public void setBeanName(String name) {
        this.fileName = name;
    }

    @Bean(initMethod = "openFile", destroyMethod = "closeFile")
    public Cashier cashier() {
        var path = System.getProperty("java.io.tmpdir") + "cashier";
        var cashier = new Cashier(path);
        return cashier;
    }
}
