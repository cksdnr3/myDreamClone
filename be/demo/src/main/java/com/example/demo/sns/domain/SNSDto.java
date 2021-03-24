package com.example.demo.sns.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class SNSDto {
    private String username;
    private String board_content;
    private String regdate;
    private String hit; //조회수
}
