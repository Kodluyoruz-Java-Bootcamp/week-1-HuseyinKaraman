package com.week1.main.orderSystem;


public class Bill {
	
	private int totalPrice;
	
	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int price) {
		this.totalPrice += price;
	}

	@Override
	public String toString() {
		return "[totalPrice=" + totalPrice + "]";
	}
	
	
}
