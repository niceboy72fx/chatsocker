package com.example.demo.config;

//import com.example.demo.auth.ApplicationAuditAware;
import com.example.demo.service.ChatServices;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;
import java.util.stream.Collectors;

@Configuration
public class ApplicationConfig {
    private final ChatServices chatServices;

    public ApplicationConfig(ChatServices chatServices) {
        this.chatServices = chatServices;
    }

//    @Bean
//    public ObjectMapper objectMapper() {
//        return new ObjectMapper();
//    }

    @Bean
    public UserDetailsService customUserDetailsService(){
        return username -> {
            com.example.demo.entity.User user = chatServices.getUserInfor(username);
            if (user != null) {
                Collection<GrantedAuthority> authorities = user.getUserRoles().stream()
                        .map(role -> new SimpleGrantedAuthority( role.getRole().getRoleName()))
                        .collect(Collectors.toList());
                return new org.springframework.security.core.userdetails.User(
                        user.getUsername(),
                        user.getPassword(),
                        authorities
                );
            } else {
                throw new UsernameNotFoundException("User not found: " + username);
            }
        };
    }


//    @Bean
//    public AuditorAware<Integer> auditorAware() {
//        return new ApplicationAuditAware();
//    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }

}
