package com.acme.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * This controller triggers the reload of properties and refreshes RefreshScope annotated beans
 */
@RestController
class RefreshController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RefreshController.class);

    @Autowired
    private ContextRefresher contextRefresher;

    public RefreshController() {
        LOGGER.info("{} created", this.getClass().getSimpleName());
    }

    @RequestMapping("/refresh")
    void refresh() {
        contextRefresher.refresh();
    }
}
