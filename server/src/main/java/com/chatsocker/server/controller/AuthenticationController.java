package com.chatsocker.server.controller;

import com.chatsocker.server.dao.request.authen.AuthenticationRequest;
import com.chatsocker.server.dao.request.authen.RegisterRequest;
import com.chatsocker.server.dao.respond.auth.AuthenticationResponse;
import com.chatsocker.server.services.AuthenticationService;
import com.chatsocker.server.services.LogoutService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.mail.MessagingException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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


}
