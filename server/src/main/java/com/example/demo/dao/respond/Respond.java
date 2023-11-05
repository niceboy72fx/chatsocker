package com.example.demo.dao.respond;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
public class Respond<T> {
    private int status;
    private String code_type;
    private T response;
    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());

    public Respond(int status, String code_type, T response) {
        this.status = status;
        this.code_type = code_type;
        this.response = response;
    }
}
