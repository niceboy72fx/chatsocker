package com.chatsocker.server.swagger;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.security.SecuritySchemes;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi controllerApi() {
        return GroupedOpenApi.builder()
                .group("controller-api")
                .packagesToScan("com.chatsocker.server.controller") // Specify the package to scan
                .build();
    }


}
