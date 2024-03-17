package com.ecommerce;

public class Product {
          private String name;
          private double price;
//constructor to set the values for product
		public Product(String name, double price) {
			this.name = name;
			this.price = price;
		}
//get the values for product
		public String getName() {
			return name;
		}
//get the values for product
		public double getPrice() {
			return price;
		}	
}
