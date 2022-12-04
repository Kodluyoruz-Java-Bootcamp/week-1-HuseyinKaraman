package com.week1.main.orderSystem;

import java.util.List;

public class Customer {

	private String name;
	private int age;
	private List<Order> orders;

	public Customer(String name, int age, List<Order> orders) {
		this.name = name;
		this.age = age;
		this.orders = orders;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public String getname() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "{ customerName=" + name + ", age=" + age + "}";
	}

}
