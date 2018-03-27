package com.oozie;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * @author Jerry Conde, webmaster@javapointers.com
 * @since 8/9/2016
 */

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(value = "com.oozie")
public class Application {
    private static final Logger LOGGER = Logger.getLogger(Application.class);
    private static final String CONTEXT = "context";
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
