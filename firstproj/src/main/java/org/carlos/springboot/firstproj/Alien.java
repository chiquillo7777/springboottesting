package org.carlos.springboot.firstproj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Autowired
   Laptop lap;

    public void code(){
        System.out.println("test");
        lap.compile();
    }



}
