package com.example.demo.auction.service;

import com.example.demo.auction.repository.AuctionRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuctionServiceImpl {
    private final AuctionRepository repo;

}
