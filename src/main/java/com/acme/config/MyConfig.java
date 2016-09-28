package com.acme.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * Reloadable Spring Configuration Properties by {@link ConfigurationPropertiesRebinderAutoConfiguration}
 */
@Component
@ConfigurationProperties(prefix = "my")
public class MyConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyConfig.class);

    private String name;
    private int age;

    public MyConfig() {
        LOGGER.info("{} created", this.getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
