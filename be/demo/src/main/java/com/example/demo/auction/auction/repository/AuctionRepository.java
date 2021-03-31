package com.example.demo.auction.auction.repository;

import com.example.demo.auction.auction.domain.Auction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AuctionRepository extends JpaRepository<Auction, Long> {

    @Query(value="UPDATE auctions SET reserved_price = reserved_price + placed_price WHERE auction_no = :auctionNo", nativeQuery = true)
    public void saveSumReservedPrice(@Param("auctionNo")long auctionNo);
}
