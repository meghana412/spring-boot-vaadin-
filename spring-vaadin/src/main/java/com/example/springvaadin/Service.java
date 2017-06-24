package com.example.springvaadin;

import org.springframework.stereotype.Component;

/**
 * Created by Anudeep on 6/24/2017.
 */
@Component
public class Service {
    public String sayhello(String name){
        return "Hello , " +name;
    }
}
