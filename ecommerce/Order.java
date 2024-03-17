package com.ecommerce;
import java.util.ArrayList;

public class Order {
	             private Customer customer1;
                 private Customer customer2;
                 private ArrayList<Product>products;

               public Order(Customer cus1,Customer cus2){
                	this.customer1 = cus1;
                	this.customer2 = cus2;
                	this.products = new ArrayList<>();
                 }
               
               public void addProduct(Product pro){
            	   products.add(pro);
               }
               
               public double calculate(){
            	   double total = 0.0;
//            	   for(int i = 0;i<products.size();i++){
//            		   System.out.println(products.getName());
//            	   }
            	   for(Product n:products){
            		   System.out.println(n.getName()+":"+n.getPrice());
            		  total += n.getPrice();
            	   }
            	   
				return total;
            	   
               }
}
