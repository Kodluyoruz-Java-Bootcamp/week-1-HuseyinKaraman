package com.week1.main.orderSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class ECommerceSystem {

	/** @Note: perşembe gunu discord'da yapılan duzenleme : */
	public static void run2() {
		ECommerceSystem eCommerceSystem = new ECommerceSystem();

		List<Product> productList = eCommerceSystem.createProductList(); // Products
		List<Order> orders = eCommerceSystem.createOrders(productList); // Orders
		List<Customer> customerList = eCommerceSystem.createCustomers(orders); // Customers

		// İsmi Cem olan müşterilerin aldıkları ürün sayısını bul
		Integer totalProduct = customerList.stream().filter(it -> it.getName().equals("Cem"))
				.map(it -> it.getOrders())
				.flatMap(Collection::stream)
				.map(it -> it.getProducts().size())
				.reduce(0, Integer::sum);

		Integer reduce = customerList.stream().filter(it -> it.getName().equals("Cem"))
				.map(it -> it.getOrders())
				.flatMap(Collection::stream)
				.map(it -> it.getProducts().size())
				.reduce(0, (sum, it) -> sum + it);

		System.out.println(totalProduct);
		System.out.println(reduce);
	}
	
	public static void run() {
		ECommerceSystem eCommerceSystem = new ECommerceSystem();

		List<Product> productList = eCommerceSystem.createProductList(); // Products
		List<Order> orders = eCommerceSystem.createOrders(productList);
		List<Customer> customerList = eCommerceSystem.createCustomers(orders); // customers

		// Sistemdeki musteri sayısı
		System.out.println("Sistemdeki musteri sayısı : " + customerList.size());

	
		// İsmi Cem olan müşterilerin aldıkları ürün sayısını bul
		List<Customer> customers = customerList.stream().filter(it -> it.getname().equals("Cem")).collect(Collectors.toList());
		
		Integer totalProduct=0;
		for (Customer customer : customers) {
			Object[] array = customer.getOrders().stream().map(it -> it.getProducts().size()).toArray();
			for (int i = 0; i < array.length; i++) {
				totalProduct += (Integer) array[i];
			}
		}
		System.out.println("\nIsmi cem olan musterilerinin aldıkları urun sayısı: " + totalProduct);

		
		// İsmi Cem olup yaşı 30’dan küçük 25’ten büyük müşterilerin toplam alışveriş tutarını hesaplayın,
		List<Customer> customers2 = customerList.stream().filter(it -> it.getname().equals("Cem"))
				.filter(it -> (it.getAge() > 25 && it.getAge() < 30)).collect(Collectors.toList());

		int totalPrice = 0;
		for (Customer customer : customers2) {
			Object[] array = customer.getOrders().stream().map(it -> it.getBill().getTotalPrice()).toArray();
			for (int i = 0; i < array.length; i++) {
				totalPrice += (Integer) array[i];
			}
		}
		System.out.println("\nİsmi Cem olup yaşı 30’dan küçük 25’ten büyük müşterilerin toplam alışveriş tutarı : "+ totalPrice);
		
		
		//	Sistemdeki 1500 TL üzerindeki faturaları listeleyin
		System.out.println("\nSistemdeki 1500 TL üzerindeki faturaları listeleyin :: ");
		List<Order> result = orders.stream().filter(it -> it.getBill().getTotalPrice()>1500).collect(Collectors.toList());
		for (Order order : result) {
			System.out.println(order +" \n");
		}

	}

	public List<Product> createProductList() {
		List<Product> productsList = new ArrayList<>(); 
        Product product  = new Product(Category.COMPUTER, "Asus Laptop", 2000, 5); // 0
		Product product1  = new Product(Category.TELEPHONE, "Samsung S9", 800, 10);
		Product product2  = new Product(Category.TELEPHONE, "Samsung S10", 1000, 8);
		Product product3  = new Product(Category.TELEPHONE, "Apple Iphone12", 1200, 6); // 3
		Product product4  = new Product(Category.TELEPHONE, "Apple Iphone13", 2000, 10);
		Product product5  = new Product(Category.HOME_KITCHEN, "Filter Coffee", 20, 20); // 5
		Product product6  = new Product(Category.MEN, "Men Shirt", 30, 20);
		Product product7  = new Product(Category.WOMEN, "Women Shirt", 25, 20); // 7
      
		return Arrays.asList(product,product1,product2,product3,product4,product5,product6,product7);
	}

	public List<Customer> createCustomers(List<Order> orders) {
		Customer huseyin = new Customer("Huseyin", 30, Arrays.asList(orders.get(0), orders.get(1)));
		Customer cem1 = new Customer("Cem", 28, Arrays.asList(orders.get(2), orders.get(3))); // order2 -> 1 urun, order3->3 urun
		Customer cem2 = new Customer("Cem", 27, Arrays.asList(orders.get(4), orders.get(2))); // order4 -> 2 urun, order2->1 urun
		Customer hasan = new Customer("Hasan", 30, Arrays.asList(orders.get(2), orders.get(3)));
		Customer merve = new Customer("Merve", 21, Arrays.asList(orders.get(3), orders.get(1)));
		Customer can = new Customer("Can", 22, Collections.emptyList());

		return Arrays.asList(huseyin,cem1,cem2,hasan,merve,can);
	}

	public List<Order> createOrders(List<Product> productsList) {
		Order order = new Order();
		order.setProducts(Arrays.asList(productsList.get(0), productsList.get(3)));

		Order order1 = new Order();
		order1.setProducts(Arrays.asList(productsList.get(5), productsList.get(4)));

		Order order2 = new Order();
		order2.setProducts(Arrays.asList(productsList.get(3)));

		Order order3 = new Order();
		order3.setProducts(Arrays.asList(productsList.get(6),productsList.get(7),productsList.get(1)));

		Order order4 = new Order();
		order4.setProducts(Arrays.asList(productsList.get(6),productsList.get(0)));

		return Arrays.asList(order, order1, order2, order3, order4);
	}

}
