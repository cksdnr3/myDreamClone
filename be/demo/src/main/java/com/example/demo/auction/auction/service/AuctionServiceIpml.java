package com.example.demo.auction.auction.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.auction.auction.domain.Auction;
import com.example.demo.auction.auction.repository.AuctionRepository;
import com.example.demo.cmm.service.AbstractService;
import com.example.demo.uss.domain.User;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AuctionServiceIpml extends AbstractService<Auction> implements AuctionService {
    private final AuctionRepository repo;

    @Override
    public Long save(Auction entity) {

        repo.save(entity);

        return null;
    }

    @Override
    public Long updateById(long id, Auction entity) {
        // for (User u : entity.getUsers()) {
        //     System.out.println(u.toString());
        // }

        Auction auction = repo.findById(id).orElseThrow();

        Auction updatedAuction = auction.builder()
            .placedPrice(entity.getPlacedPrice())
            .regdate(entity.getRegdate())
            .winBid(entity.getWinBid())
            .reservedPrice(entity.getReservedPrice())
            .build();
    
        repo.save(updatedAuction);

        return null;
    }

    @Override
    public void saveSumReservedPrice(long auctionNo) {
        repo.saveSumReservedPrice(auctionNo);
    }

    @Override
    public Optional<Auction> findById(long id) {

        return repo.findById(id);
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