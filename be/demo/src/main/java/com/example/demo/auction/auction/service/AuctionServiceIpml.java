package com.example.demo.auction.auction.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.auction.auction.domain.Auction;
import com.example.demo.auction.auction.repository.AuctionRepository;
import com.example.demo.cmm.service.AbstractService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AuctionServiceIpml extends AbstractService<Auction> implements AuctionService {
    private final AuctionRepository repo;

    @Override
    public Auction save(Auction entity) {
        return repo.save(entity);
    }

    @Override
    public Optional<Auction> findById(long id) {
        return repo.findById(id);
    }

    @Override
    public void saveSumReservedPrice(long auctionNo) {
        repo.saveSumReservedPrice(auctionNo);
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public boolean existsById(long id) {
        return false;
    }

    @Override
    public List<Auction> findAll() {
        return repo.findAll();
    }

    @Override
    public void deleteById(long id) {
        repo.deleteById(id);
    }

    @Override
    public Auction getOne(long id) {
        return null;
    }
}