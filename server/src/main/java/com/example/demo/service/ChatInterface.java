package com.example.demo.service;

import com.example.demo.dao.respond.Respond;
import com.example.demo.entity.Messenger;
import com.example.demo.entity.RolePermission;
import com.example.demo.entity.User;
import com.example.demo.entity.UserRole;

import java.util.List;

public interface ChatInterface {
    List<User> getAllUser();
    public Respond<String> register(User user, String role);
    public User getUserInfor(String name);
    public List<Messenger> getListMessengerViaId (Integer idChat);
}
