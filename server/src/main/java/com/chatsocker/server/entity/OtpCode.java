package com.chatsocker.server.entity;

import com.chatsocker.server.enums.TokenType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OtpCode {
    @Id
    @GeneratedValue
    public Integer id;

    @Column(name = "otp_code")
    public Long otpCode;

    @Column(name ="otp_expire")
    public Timestamp otpExpire;

    @Column(name ="otp_start")
    public Timestamp otpStart;

    public boolean revoked;

    public boolean expired;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    public User user;
}
