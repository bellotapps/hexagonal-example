package com.bellotapps.examples.hexagonal.models.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for the model's module.
 */
@Configuration
@ComponentScan(basePackages = {
        "com.bellotapps.examples.hexagonal.models"
})
public class ModelsConfig {
}
