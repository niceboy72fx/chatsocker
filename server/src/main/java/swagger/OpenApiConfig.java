package swagger;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.security.SecuritySchemes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.Annotation;

//@Configuration
public class OpenApiConfig implements SecuritySchemes {
    @Bean
    public SecuritySchemes securitySchemes() {
        SecurityScheme bearerAuth = new SecurityScheme()
                .type(SecuritySchemeType.HTTP)
                .scheme("bearer")
                .bearerFormat("JWT");
        return new SecuritySchemes()
                .addSecurityScheme("bearerAuth", bearerAuth);
    }

    @Override
    public SecurityScheme[] value() {
        return new SecurityScheme[0];
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
