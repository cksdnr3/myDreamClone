package com.example.demo.qnaboard.domain;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "")
public class QnA {

    @Id
    @GeneratedValue
    @Column(name = "board_no")
    private long boardNo;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "username")
    private String username;

    @Column(name = "regdate")
    private Date regdate;
}
