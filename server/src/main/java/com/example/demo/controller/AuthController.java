package com.example.demo.controller;

import com.example.demo.config.HashPasswordConfig;
import com.example.demo.config.JwtService;
import com.example.demo.dao.request.Auth.Login;
import com.example.demo.dao.request.Auth.Register;
import com.example.demo.dao.respond.Respond;
import com.example.demo.entity.User;
import com.example.demo.service.ChatServices;
import io.jsonwebtoken.Jwts;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class AuthController {
    @Autowired
    private ChatServices chatServices;

    @Autowired
    private HashPasswordConfig hashBase256;

    private final JwtService jwtService;


    @GetMapping("/test")
    @Operation(summary = "test api")
    private String test(@RequestHeader("Authorization") String token) {
        String username = Jwts.parser().setSigningKey("secret").parseClaimsJws(token).getBody().getSubject();
        return "auth okela";
    }



    @PostMapping("/register")
    @Operation(summary = "Create a new user.", description = "This API creates a new user in the system.")
    private ResponseEntity<?> regiter( @RequestBody Register register){
        try{
            User user = chatServices.getUserInfor(register.getUsername());
            if (user != null) {
                Respond<String> response = new Respond<>(401,"Existed!","User is exited!");
                return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
            }
            if (register.getPassword().equals(register.getReTypePassword())){
                        String hashedPassword = hashBase256.hashWithSHA256(register.getPassword());
                        User newUser = new User();
                        newUser.setUserName(register.getUsername());
                        newUser.setPassword(hashedPassword);
                        newUser.setEmail(register.getEmail());
                        return new ResponseEntity<>(chatServices.register(newUser,"USER"), HttpStatus.OK);

            }else {
                    Respond<String> response = new Respond<>(401, "Unauthorized", "Password isn't match !");
                    return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
            }

        } catch (Exception e) {
            Respond<String> response = new Respond<>(500, "Error", "Internal server error");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/login")
    @Operation(summary = "Login account!", description = "Login")
    private ResponseEntity<?> login( @RequestBody Login login){
        try{
            User user = chatServices.getUserInfor(login.getUserName());
            if (user == null) {
                Respond<String> response = new Respond<>(401,"Not Found!","User isn't exited!");
                return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
            }
            if (user.getPassword().equals(hashBase256.hashWithSHA256(login.getPassWord()))){
                String jwtToken = jwtService.generateToken(user);
                Respond<String> respond = new Respond<>(200, "Ok", jwtToken);
                return new ResponseEntity<>(respond, HttpStatus.OK);
            } else {
                Respond<String> response = new Respond<>(401, "Unauthorized", "Password isn't match !");
                return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
            }
        } catch (Exception e) {
            Respond<String> response = new Respond<>(500, "Error", "Internal server error");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
