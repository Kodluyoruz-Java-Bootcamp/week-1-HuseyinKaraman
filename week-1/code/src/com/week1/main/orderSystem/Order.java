package com.week1.main.orderSystem;

import java.util.List;

public class Order {

	private List<Product> products;
	private Bill bill;

	public Order() {
		this.bill = new Bill();
	}
	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
		for (Product product : products) {
			bill.setTotalPrice(product.getPrice());
		}
	}
	
	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	private String printProducts() {
		String str = "";
		for (Product product : products) {
			str += product+" \n";
		}
		return str;
	}
	
	@Override
	public String toString() {
		return "Order [products=" + printProducts() + ", bill=" + bill + "]";
	}

}
