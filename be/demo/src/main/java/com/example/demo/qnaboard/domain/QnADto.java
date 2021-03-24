package com.example.demo.qnaboard.domain;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class QnADto {
    private long boardNo;
    private String title;
    private String content;
    private String username;
    private Date regdate;
}
