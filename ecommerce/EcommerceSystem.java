package com.ecommerce;

public class EcommerceSystem {

	public static void main(String[] args) {
//create product
		
		Product phone = new Product("Samsung",10000);
		Product speaker = new Product("Nokia",20000);
		Product laptop = new Product("Apple",30000);
//create customer
		
		Customer customer1 = new Customer("Madhan","madhan@gmail.com");
		Customer customer2 = new Customer("Kumar","kumar@gmail.com");
		
//create order
		
		Order order = new Order(customer1,customer2);
           order.addProduct(phone);
           order.addProduct(speaker);
           order.addProduct(laptop);
		
//calculate
           double orderedPrice = order.calculate();
		System.out.println(orderedPrice);
		
	}

}
