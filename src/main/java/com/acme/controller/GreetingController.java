package com.acme.controller;

import com.acme.config.MyConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tave on 27.09.16.
 */
@RestController
class GreetingController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingController.class);

    @Autowired
    private MyConfig config;

    public GreetingController() {
        LOGGER.info("{} created", this.getClass().getSimpleName());
    }

    @RequestMapping("/greet")
    String greet() {
        return String.format("Hello %s! You are %d years old!", config.getName(), config.getAge());
    }
}
