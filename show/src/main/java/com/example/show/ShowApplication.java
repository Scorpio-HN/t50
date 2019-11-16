package com.example.show;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShowApplication {

    public static void main(String[] args)
    {
        System.out.println("main");
        SpringApplication.run(ShowApplication.class, args);
    }

}
