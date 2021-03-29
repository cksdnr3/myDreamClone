package com.example.demo.auction.product.service;

import java.util.Optional;

import com.example.demo.auction.product.domain.Product;

public interface ProductService {
	public Optional<Product> findById(long id);
}
