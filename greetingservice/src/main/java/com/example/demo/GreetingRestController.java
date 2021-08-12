package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRestController implements Greeting {

    @Override
    public String greeting() {
        return "Hello word from GreetingServicee";
    }
}
