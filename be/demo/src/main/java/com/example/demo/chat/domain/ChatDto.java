package com.example.demo.chat.domain;

import java.io.Serializable;


import org.springframework.stereotype.Component;

import lombok.Data;



@Component
@Data
public class ChatDto implements Serializable{
	private static final long serialVersionUID = 1L;
	private long boardNo;
	private String button;
	private String keyboard;
	private String delete;
	private String username;
	private String regdate;
}

