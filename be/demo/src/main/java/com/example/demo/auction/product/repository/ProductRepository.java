package com.example.demo.auction.product.repository;

import com.example.demo.auction.product.domain.Product;

import org.springframework.data.jpa.repository.JpaRepository;

interface ProudctCustomRepository {

}

public interface ProductRepository extends JpaRepository<Product, Long>, ProudctCustomRepository {

}