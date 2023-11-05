package com.example.demo.config;

import io.jsonwebtoken.Claims;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.security.Key;
import java.util.Date;
import java.util.Map;
import java.util.function.Function;

public interface JwtServiceInterface {
    public String extractUsername(String token);
    public <T> T extractClaim(String token , Function<Claims,T> claimsResolve);
    public Key getSignKey();
    public Claims extractAllClaim(String token);
    public String buildToken( User user);
    public String generateToken( User user);

    public Date extractExpiration(String token);
    public boolean isTokenExpired(String token);
    public boolean isTokenValid(String token , UserDetails userDetails);
}
