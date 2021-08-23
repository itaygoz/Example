package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Autowired
    private DemoConfig demoConfig;

    public void someMethod() {
        System.out.println("Should failed loading context");
        demoConfig.config();
    }
}
