package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "delete_messages")
public class DeleteMessages {
    @Id
    @Column(name = "id_deleted")
    private long idDeleted;

    @ManyToOne
    @JoinColumn(name = "id_messenger")
    private Messenger messenger;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name="create_at")
    private Timestamp createAt;
}
