package com.springcore.JavaConfigDAO;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var basePackages = "com.springcore.UsingJavaConfigToConfigurePOJOsDAO";
        try( var context = new AnnotationConfigApplicationContext(basePackages)) {
            var sequenceDao = context.getBean(SequenceDao.class);
            System.out.println(sequenceDao.getNextValue("IT"));
            System.out.println(sequenceDao.getNextValue("IT"));
        }
    }
}
