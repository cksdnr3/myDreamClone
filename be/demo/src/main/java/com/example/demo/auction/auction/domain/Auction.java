package com.example.demo.auction.auction.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.uss.domain.User;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
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

    @Column(name="product")
    private String product;

    @OneToMany(mappedBy = "auction")
    public List<User> user;
}
