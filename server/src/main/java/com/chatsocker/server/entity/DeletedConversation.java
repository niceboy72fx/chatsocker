package com.chatsocker.server.entity;

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
@Table(name = "delete_conversation")
public class DeletedConversation {
    @Id
    @Column(name="id_deleted")
    private long id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "conversation_id")
    private Conversation conversation;

    @Column(name = "time_stamp")
    private Timestamp timestamp;
}
