package com.week1.main.orderSystem;

public class Product {
	private static int ID_GENERATOR;
	private int productId;
	private Category category;
	private String productName;
	private int price;
	private int stock;
	
	public Product(Category category, String productName, int price, int stock) {
		this.productId = ID_GENERATOR++;
		this.category = category;
		this.productName = productName;
		this.price = price;
		this.stock = stock;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", category=" + category + ", productName=" + productName
				+ ", price=" + price + ", stock=" + stock + "]";
	}
}
