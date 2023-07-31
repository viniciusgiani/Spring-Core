package com.springcore.JavaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(SequenceConfiguration.class);){
            var generator = context.getBean("sequenceBean", Sequence.class);
            System.out.println(generator.nextValue());
            System.out.println(generator.nextValue());
        }
    }
}
