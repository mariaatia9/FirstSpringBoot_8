package com.ibb.demo;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ibb.*")
public class FirstSpringBootApplication {

    private static final Logger LOG = Logger.getLogger(FirstSpringBootApplication.class.getName());

    public static void main(String[] args) {
        
        ApplicationContext ctx = SpringApplication.run(FirstSpringBootApplication.class, args);
        System.setProperty("log4j.skipJansi", "false");
//        String[] names = ctx.getBeanDefinitionNames();
//        for (String s : names) {
//            LOG.log(Level.INFO, s);
//        }
    }

}
