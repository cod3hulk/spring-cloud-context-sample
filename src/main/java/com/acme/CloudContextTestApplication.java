package com.acme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration;
import org.springframework.cloud.autoconfigure.RefreshAutoConfiguration;
import org.springframework.cloud.context.properties.ConfigurationPropertiesRebinder;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.cloud.context.scope.refresh.RefreshScope;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * Application entry point.
 * Imports {@link RefreshAutoConfiguration} for support of 
 */
@SpringBootApplication
@Import(value = {ConfigurationPropertiesRebinderAutoConfiguration.class, RefreshAutoConfiguration.class})
public class CloudContextTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudContextTestApplication.class, args);
    }
}
