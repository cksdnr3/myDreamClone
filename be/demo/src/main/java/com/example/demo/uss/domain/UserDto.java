package com.example.demo.uss.domain;

import java.sql.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component 
public class UserDto {
	private long userNo;
	private String username;
	private String password;
	private String realName;
	private String email;
	private Date birthday;
	private String gender;
	private Date regdate;
	private String phoneNumber;
}
