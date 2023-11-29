package com.chatsocker.server.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "conversation")
public class Conversation {
    @Id
    @Column(name = "conversation_id")
    private long idConversation;

    @Column(name = "conversation_name")
    private String conversationName;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "update_at")
    private Timestamp updateAt;
}
