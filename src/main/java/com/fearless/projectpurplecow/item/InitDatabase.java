package com.fearless.projectpurplecow.item;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitDatabase {
    private static final Logger LOG = LoggerFactory.getLogger(InitDatabase.class);

    @Bean
    CommandLineRunner initializeDatabase(ItemRepository repository) {
        return args -> LOG.info("Database started.");
    }
}
