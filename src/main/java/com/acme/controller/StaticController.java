package com.acme.controller;

import com.acme.config.MyConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sample for static spring bean - to show that this beans are not refreshed when
 * ContextRefresher gets triggered.
 */
@RestController
class StaticController {

    private static final Logger LOGGER = LoggerFactory.getLogger(StaticController.class);

    public StaticController() {
        LOGGER.info("{} created", this.getClass().getSimpleName());
    }

    @RequestMapping("/static/message")
    String message() {
        return "Hello, world!";
    }
}
