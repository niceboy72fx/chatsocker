package com.example.demo.service;

import com.example.demo.config.JwtService;
import com.example.demo.dao.respond.Respond;
import com.example.demo.entity.Messenger;
import com.example.demo.entity.RolePermission;
import com.example.demo.entity.User;
import com.example.demo.entity.UserRole;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ChatServices implements ChatInterface {
  private final EntityManager entityManager;
  private final JwtService jwtService;



  public ChatServices(EntityManager entityManager, JwtService jwtService){
      this.entityManager = entityManager;
      this.jwtService = jwtService;
  }

  @Override
  @Transactional
  public List<User> getAllUser(){
      TypedQuery<User> queryAllUser = entityManager.createQuery("from User", User.class);
      return queryAllUser.getResultList();
  }

  @Override
  @Transactional
  public Respond<String> register(User user, String role){
      TypedQuery<RolePermission> query = entityManager.createQuery("SELECT rp FROM RolePermission rp WHERE rp.roleName = :roleName", RolePermission.class);
      query.setParameter("roleName", role);

      RolePermission existingRolePermission = null;

      try {
          existingRolePermission = query.getSingleResult();
      } catch (NoResultException ex) {
          // If the role permission doesn't exist, create a new one
          existingRolePermission = new RolePermission();
          existingRolePermission.setRoleName(role);
          entityManager.persist(existingRolePermission);
      }

      UserRole userRole = new UserRole();
      userRole.setUsers(user);
      userRole.setRole(existingRolePermission);
      List<UserRole> userRoles = new ArrayList<>();
      userRoles.add(userRole);
      user.setUserRoles(userRoles);
      String jwtToken = jwtService.generateToken(user);
      entityManager.persist(user);
      return new Respond<>(200, "Ok", jwtToken);
  }


    @Override
    @Transactional
    public User getUserInfor(String name) {
        TypedQuery<User> queryGetUser = entityManager.createQuery("SELECT u FROM User u WHERE u.userName = :name", User.class);
        queryGetUser.setParameter("name", name);
        List<User> resultList = queryGetUser.getResultList();
        if (resultList != null && !resultList.isEmpty()) {
            return resultList.get(0);
        } else {
            return null;
        }
    }


    @Override
  @Transactional
  public List<Messenger> getListMessengerViaId (Integer idChat){
      TypedQuery<Messenger> queryGetListMessenger = entityManager.createQuery("select Messenger  from Messenger where Messenger.idMess = :idChat", Messenger.class);
      queryGetListMessenger.setParameter("idChat",idChat);
      return queryGetListMessenger.getResultList();
  }

}
