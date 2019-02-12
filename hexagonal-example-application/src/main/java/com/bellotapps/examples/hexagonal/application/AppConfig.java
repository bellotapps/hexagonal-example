package com.bellotapps.examples.hexagonal.application;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Main configuration class.
 */
@Configuration
@ComponentScan(value = {
        "com.bellotapps.examples.hexagonal.*.config"
})
public class AppConfig {
}
