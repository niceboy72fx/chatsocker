package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name ="Messenger")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Messenger {
    @Id
    @Column(name = "id_mess")
    private long idMess;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @Column(name = "text_message")
    private String textMessage;

    @OneToMany(mappedBy="messenger" , cascade = CascadeType.ALL)
    private List<DeleteMessages> deleteMessages;

    @Column(name = "time_stamp")
    private Timestamp timeStamp;

}
