package com.chatsocker.server.services;

import com.chatsocker.server.util.UtilFunction;
import jakarta.mail.Address;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private  UtilFunction mailTemplate;


    public void sendEmail(String to, String subject, String text) throws MessagingException {
        MimeMessage message = javaMailSender.createMimeMessage();
        message.setFrom("chatsocker@gmail.com");
        message.setRecipients(MimeMessage.RecipientType.TO,to);
        message.setSubject(subject);
        message.setContent(mailTemplate.templateIOtpMail("84562", text), "text/html; charset=utf-8");
        Properties mailProperties = new Properties();
        mailProperties.setProperty("mail.smtp.auth", "true");
        mailProperties.setProperty("mail.smtp.starttls.enable", "true");
        mailProperties.setProperty("mail.smtp.starttls.required", "true");
        javaMailSender.send(message);
    }
}
