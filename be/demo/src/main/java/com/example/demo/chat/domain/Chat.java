package com.example.demo.chat.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chats")
public class Chat {
	
	@Id
	@GeneratedValue
	@Column(name = "board_no")
	private long boardNo;

	@Column(name ="button")
	private String button;

	@Column(name = "keyboard")
	private String keyboard;

	@Column(name = "username")
	private String username;
	
	@Column(name = "delete")
	private String delete;

	@Column(name = "regdate")
	private String regdate;
}

