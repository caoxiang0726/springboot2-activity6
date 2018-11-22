package com.cx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by caoxiang on 2018/3/18.
 */
@SpringBootApplication
public class SpringbootApp {
    public static void main(String[] args)  {
        System.out.println("boot jar");
        SpringApplication.run(SpringbootApp.class, args);
    }


}
