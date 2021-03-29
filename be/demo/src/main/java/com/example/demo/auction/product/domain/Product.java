package com.example.demo.auction.product.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {

	@Id
	@Column(name = "item_no")
	@GeneratedValue
	public long itemNo;

	@Column(name = "item_brand")
	public String itemBrand;

	@Column(name = "model_no")
	public String modelNo;

	@Column(name = "item_name")
	public String itemName;

	@Column(name = "item_color")
	public String itemColor;

	@Column(name = "release_date")
	public String releaseDate;
}