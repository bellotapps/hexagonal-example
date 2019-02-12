package com.bellotapps.examples.hexagonal.rest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class in charge of configuring web concerns.
 */
@Configuration
@ComponentScan(basePackages = {
        "com.bellotapps.examples.hexagonal.rest.controller"
})
public class WebConfig {
}
