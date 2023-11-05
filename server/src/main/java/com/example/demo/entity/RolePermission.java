package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "role_permission")
public class RolePermission {
    @Id
    @Column(name = "id_role")
    @SequenceGenerator(name = "role_sequence",sequenceName = "role_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "role_sequence")
    private long idRole;

//    @OneToMany(mappedBy = "Role", cascade = CascadeType.ALL)
//    private ArrayList<UserRole> UserRole;

    @Column(name = "role_name")
    private String roleName;

}
