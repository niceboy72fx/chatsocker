package com.chatsocker.server.dto.request.authen;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    @JsonProperty("username")
    private String userName;
    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;
}
