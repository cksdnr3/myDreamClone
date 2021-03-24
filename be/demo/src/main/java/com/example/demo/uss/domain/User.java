package com.example.demo.uss.domain;

import javax.persistence.*;

@Entity
@Table( name = "users")
public class User {
	
    @Id
    @GeneratedValue
    @Column(name="user_no")
	private long userNo;
	
	@Column(name = "username") 
	private String username;

	@Column(name = "password") 
	private String password;
		
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "birthday")
	private String birthday;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "regdate")
	private String regdate;
    
    @Column(name = "phone_number")
	private String phone_number;
}
