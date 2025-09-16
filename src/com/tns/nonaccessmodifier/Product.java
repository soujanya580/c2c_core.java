package com.tns.nonaccessmodifier;
public class Product {

		private int productId;
		private String productName;
		private double price;
		
	        public Product(int productId, String productName, double price) {
		    this.productId = productId;
		    this.productName = productName;
		    setPrice(price); 
		}

		public double getPrice() {
		    return price;
		}

		public void setPrice(double price) {
		    this.price = (price > 0) ? price : 0;
		    if (price <= 0) System.out.println("Invalid price!");
		}
		public String toString() {
		    return "Product ID: " + productId +
		           "\nProduct Name: " + productName +
		           "\nProduct Price: " + price;
		}


	public static void main(String[] args) {
		Product product1 = new Product(101, "Laptop", 1200.50);
	    Product product2 = new Product(102, "Mouse", -10.0);

	    System.out.println("Product 1 Details:\n" + product1);
	    System.out.println("\nProduct 2 Details:\n" + product2);

	}
	}
