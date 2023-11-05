package com.example.demo.dao.request.Auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Register {
    private String username;
    private String password;
    private String reTypePassword;
    private String email;
}
