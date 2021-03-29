package com.example.demo.auction.product.controller;
import java.util.Optional;

import com.example.demo.auction.product.domain.Product;
import com.example.demo.auction.product.service.ProductServiceImpl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

@Log
@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {
    private final ProductServiceImpl service;

    @GetMapping("/{productNo}")
    public ResponseEntity<Optional<Product>> read(
        @PathVariable long productNo) throws Exception {
        log.info("create()");
        
        Optional<Product> product = service.findById(productNo);

        return new ResponseEntity<>(product, HttpStatus.OK);
    }
}
