package com.example.demo.auction.product.domain;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ProductDto implements Serializable {
    private static final long serialVersionUID = 1L;
	public long itemNo;
	public String itemBrand;
	public String modelNo;
	public String itemName;
	public String itemColor;
	public String releaseDate;
}
