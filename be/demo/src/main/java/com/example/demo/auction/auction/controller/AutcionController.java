package com.example.demo.auction.auction.controller;

import java.util.List;
import java.util.Optional;

import com.example.demo.auction.auction.domain.Auction;
import com.example.demo.auction.auction.service.AuctionServiceIpml;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

@Log
@RequiredArgsConstructor
@RequestMapping("/auctions")
@RestController
@CrossOrigin("*")
public class AutcionController {
    private final AuctionServiceIpml service;

    @PostMapping("")
    public ResponseEntity<String> create(
        @RequestBody Auction auction) {
        log.info("Auction: create()");

        service.save(auction);

        return new ResponseEntity<>("sucess", HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<List<Auction>> list() {
        log.info("Auctions List");

        List<Auction> auctionList = service.findAll();

        return new ResponseEntity<>(auctionList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Auction>> read(@PathVariable long id) {

        Optional<Auction> auction = service.findById(id);

        return new ResponseEntity<>(auction, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable long id, 
                                        @RequestBody Auction entity) {
        service.saveSumReservedPrice(id);
        // log.info("users: " + entity.getUsers().size());
        // if (false) {
            
        // } else {
        //     service.updateById(id, entity);
        // }
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {

        service.deleteById(id);

        return new ResponseEntity<>("delete success", HttpStatus.NO_CONTENT);
    }
}