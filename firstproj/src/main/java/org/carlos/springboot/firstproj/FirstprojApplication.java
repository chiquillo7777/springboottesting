package org.carlos.springboot.firstproj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.carlos.springboot.firstproj.Alien;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstprojApplication {

    public static void main(String[] args) {
        ApplicationContext context =SpringApplication.run(FirstprojApplication.class, args);
        //Alien obj1 = new Alien();
        Alien obj1 = context.getBean(Alien.class);
        obj1.code();
    }




}
