package com.ecommerce;

public class Customer {
           String name;
           String email;
//constructor to set values for customer          
		public Customer(String name, String email) {
			this.name = name;
			this.email = email;
		}
//get values for customer		
		public String getName() {
			return name;
		}
//get values for customer
		public String getEmail() {
			return email;
		}

           
}
