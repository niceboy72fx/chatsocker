package com.example.demo.config;

import com.example.demo.entity.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.Key;
import java.util.Date;
import java.util.Map;
import java.util.function.Function;

@Service
public class JwtService  {


    public  final String SECRET_KEY = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
    public String extractUsername(String token){
        return extractClaim(token,Claims::getSubject);
    }

    public String extractToken(HttpServletRequest request) {
        // Extract the token from the request, e.g., from the "Authorization" header
        // Return the token string
    }

    public <T> T extractClaim(String token , Function<Claims ,T> claimsResolve){
        final Claims claims = extractAllClaim(token);
        return claimsResolve.apply(claims);
    }

    public Key getSignKey(){
        try {
            byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
            return Keys.hmacShaKeyFor(keyBytes);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public Claims extractAllClaim(String token){
        return Jwts.parserBuilder()
                .setSigningKey(getSignKey())
                .build()
                .parseClaimsJwt(token)
                .getBody();
    }

    private String buildToken( User user){
        return Jwts.builder()
                .claim("Id",user.getIdUser())
                .setSubject(String.valueOf(user.getIdUser()))
                .setSubject(user.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 *24 ))
                .signWith(getSignKey(), SignatureAlgorithm.HS256) // dead
                .compact();
    }



    public String generateToken(
            com.example.demo.entity.User user
    ) {
        return buildToken( user);
    }

    public Date extractExpiration(String token){
        return extractClaim(token , Claims::getExpiration);
    }

    public boolean isTokenExpired(String token){
        return extractExpiration(token).before(new Date());
    }

    public boolean isTokenValid(String token , UserDetails userDetails){
        final String userName = extractUsername(token);
        return (userName.equals(userDetails.getUsername())) && !isTokenExpired(token);
    }
}

