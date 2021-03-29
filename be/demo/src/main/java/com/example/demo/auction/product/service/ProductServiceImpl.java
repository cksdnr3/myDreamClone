package com.example.demo.auction.product.service;

import java.util.Optional;

import com.example.demo.auction.product.domain.Product;
import com.example.demo.auction.product.repository.ProductRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository repo;

    @Override
    public Optional<Product> findById(long id) {
        return repo.findById(id);
    }
}
