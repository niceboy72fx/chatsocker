package com.chatsocker.server.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name ="user_groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_group;

    @Column(name = "group_name")
    private String groupName;

    @OneToMany(mappedBy = "group", cascade = {CascadeType.ALL})
    private List<User> user;
}
