package com.example.demo.auction.auction.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Getter
@Table(name="auctions")
public class Auction {
    
    @Id
    @GeneratedValue
    @Column(name="auction_no")
    private long auctionNo;

    @Column(name="regdate")
    private Date regdate;

    @Column(name="win_bid")
    private String winBid;

    @Column(name="reserved_price")
    private String reservedPrice;

    @Column(name="placed_price")
    private String placedPrice;

    @Column(name="product_no")
    private String productNo;

    @Column(name="user_no")
    private String userNo;

    @Column(name="username")
    private String username;

    @Column(name="product")
    private String product;
}
