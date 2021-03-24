package com.example.demo.auction.repository;

import com.example.demo.auction.domain.Auction;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionRepository extends JpaRepository<Auction, Long> {
    
}