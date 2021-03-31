package com.example.demo.uss.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.auction.auction.domain.Auction;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "users")
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
	private String realName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "birthday")
	private Date birthday;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "regdate")
	private Date regdate;
    
    @Column(name = "phone_number")
	private String phoneNumber;

	@ManyToOne
	@JoinColumn(name="auction_id")
	private Auction auction;
}
