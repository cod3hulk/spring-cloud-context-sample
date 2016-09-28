package com.acme.controller;

import com.acme.config.MyConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This controller is an example for reloading property values inside a Spring Bean
 */
@RefreshScope
@RestController
class MessageController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageController.class);

    @Value("${message:Hello, default!}")
    private String message;

    public MessageController() {
        LOGGER.info("{} created", this.getClass().getSimpleName());
    }

    @RequestMapping("/message")
    String message() {
        return message;
    }
}
