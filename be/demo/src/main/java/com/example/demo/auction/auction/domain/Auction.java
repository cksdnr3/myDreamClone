package com.example.demo.auction.auction.domain;

import java.util.ArrayList;
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

import lombok.Builder;
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

    // @OneToMany(mappedBy = "auction", fetch = FetchType.EAGER)
    // public List<User> users = new ArrayList<User>();

    @Builder
    public Auction(Date regdate, String winBid, 
                String reservedPrice, String placedPrice, List<User> users) {
        this.regdate = regdate;
        this.winBid = winBid;
        this.reservedPrice = reservedPrice;
        this.placedPrice = placedPrice;
        // this.users = users;
    }
}
