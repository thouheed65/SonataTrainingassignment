package com.sonata.Model;

public class Product {
	private int productID;
	private String productName;
	private double productPrice;
	public Product() {}
	public Product(int prodID , String prodName , double prodPrice) {
		this.productID = prodID;
		this.productName = prodName;
		this.productPrice = prodPrice;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", productPrice=" + productPrice + "]";
	}
}