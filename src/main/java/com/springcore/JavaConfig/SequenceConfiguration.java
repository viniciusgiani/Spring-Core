package com.springcore.JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class SequenceConfiguration {


    @Bean(name = "sequenceBean")
    public Sequence sequence() {
        var sequenceGenerator = new Sequence();
        sequenceGenerator.setPrefix("30");
        sequenceGenerator.setSuffix("A");
        sequenceGenerator.setInitial(1000000);
        return sequenceGenerator;
    }

}
