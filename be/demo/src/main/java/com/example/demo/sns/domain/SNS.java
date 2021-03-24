package com.example.demo.sns.domain;

import javax.persistence.*;

@Entity
@Table(name = "boards")
public class SNS {
    
    @Id
    @GeneratedValue
    @Column(name = "username")
    private String username;
    
    @Column(name = "board_content")
    private String boardContent;

    @Column(name = "regdate")
    private String regdate;

    @Column(name = "hit")
    private String hit;
}
