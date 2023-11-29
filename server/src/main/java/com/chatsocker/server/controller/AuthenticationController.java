package com.chatsocker.server.controller;

import com.chatsocker.server.dto.request.authen.AuthenticationRequest;
import com.chatsocker.server.dto.request.authen.RegisterRequest;
import com.chatsocker.server.dto.respond.auth.AuthenticationResponse;
import com.chatsocker.server.services.AuthenticationService;
import com.chatsocker.server.security.LogoutService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.mail.MessagingException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private LogoutService logoutService;


    @PostMapping("/register")
    @Operation(summary = "test api")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request) throws MessagingException {
      return ResponseEntity.ok(authenticationService.registerService(request));
    }

    @PostMapping("/authenticate")
    @Operation(summary = "test api")
    public ResponseEntity<AuthenticationResponse> authenticated(@RequestBody AuthenticationRequest request){
        return ResponseEntity.ok(authenticationService.authenticateService(request));
    }

    @PostMapping("/refresh-token")
    @Operation(summary = "test api")
    public void refreshToken(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException {
        authenticationService.refreshToken(request, response);
    }

    @GetMapping("/logout")
    @Operation(summary = "log out")
    public void logout(HttpServletRequest request, HttpServletResponse response , Authentication authentication) {
        SecurityContextLogoutHandler logoutHandler = new SecurityContextLogoutHandler();
        logoutHandler.logout(request, response, authentication);
        logoutService.logout(request, response, authentication);
        System.out.println("run");
        logoutHandler.setClearAuthentication(true);
        SecurityContextHolder.clearContext();
    }


}
