package com.chatsocker.server.security;

import com.chatsocker.server.entity.Token;
import com.chatsocker.server.repository.TokenRepository;
import com.chatsocker.server.services.AuthenticationService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class JwtAuthenticatorFilter extends OncePerRequestFilter {

    @Autowired
    private  JwtService jwtService;

    @Autowired
    private UserDetailsService userDetailsService;

//    @Autowired
//    private AuthenticationService authenticationService;

    @Autowired
    private TokenRepository tokenRepository;

    public JwtAuthenticatorFilter(JwtService jwtService , UserDetailsService userDetailsService) {
        this.jwtService = jwtService;
        this.userDetailsService = userDetailsService;
    }

    @Override
    protected void doFilterInternal(@NonNull  HttpServletRequest request, @NonNull HttpServletResponse response, @NonNull FilterChain filterChain) throws ServletException, IOException {
        final String authHeader = request.getHeader("Authorization");
        final String jwt;
        final String userEmail;
        if (authHeader == null || !authHeader.startsWith("Bearer ")){
            filterChain.doFilter(request,response);
            return;
        }

        jwt = authHeader.substring(7);
//        var isExpried = tokenRepository.findByToken(jwt).orElse(null);
        userEmail = jwtService.extractUsername(jwt);
        if (userEmail != null && SecurityContextHolder.getContext().getAuthentication() == null  ){

                UserDetails userDetails = this.userDetailsService.loadUserByUsername(userEmail);
                if (jwtService.isTokenValid(jwt, userDetails)){
                    UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
                            userDetails,
                            null,
                            userDetails.getAuthorities()
                    );
                    authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                    SecurityContextHolder.getContext().setAuthentication(authToken);
                }

        }
        filterChain.doFilter(request ,response);
    }
}
