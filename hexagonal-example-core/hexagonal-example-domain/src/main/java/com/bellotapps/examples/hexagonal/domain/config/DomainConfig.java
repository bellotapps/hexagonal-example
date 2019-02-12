package com.bellotapps.examples.hexagonal.domain.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for the domain's module.
 */
@Configuration
@ComponentScan(basePackages = {
        "com.bellotapps.examples.hexagonal.domain"
})
public class DomainConfig {
}
