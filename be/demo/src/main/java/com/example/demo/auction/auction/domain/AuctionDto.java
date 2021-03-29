package com.example.demo.auction.auction.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class AuctionDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private long auctionNo;
    private String winBid;
    private String reservedPrice;
    private String placedPrice;
    private String bid;
    private String productNo;
    private String userNo;
    private Date regdate;
}
