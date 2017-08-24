package com.venkat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by venkatram.veerareddy on 8/23/2017.
 */

@SpringBootApplication
public class JpaApplication {

    /*@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(JpaApplication.class);
    }*/

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }
}
