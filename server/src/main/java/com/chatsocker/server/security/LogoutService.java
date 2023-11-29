package com.chatsocker.server.security;

import com.chatsocker.server.repository.TokenRepository;
import com.chatsocker.server.services.AuthenticationService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.stereotype.Service;

@Service
public class LogoutService implements LogoutHandler {
    @Autowired
    private TokenRepository tokenRepository;

    @Autowired
    private AuthenticationService authenticationService;
    @Override
    public void logout(HttpServletRequest request, HttpServletResponse response , Authentication authentication){
        final String authHeader = request.getHeader("Authorization");
        final String jwt;
        if (authHeader == null || !authHeader.startsWith("Bearer ")){
            System.out.println("exception ");
            return;
        }
        jwt = authHeader.substring(7);
        System.out.println("run 1");
        var storedToken = tokenRepository.findByToken(jwt).orElse(null);
        if (storedToken != null ) {
            storedToken.setExpired(true);
            storedToken.setRevoked(true);
            tokenRepository.save(storedToken);
            System.out.println("run 2");
            SecurityContextHolder.clearContext();
        } else {
            System.out.println("run 3");
        }
    }
}
