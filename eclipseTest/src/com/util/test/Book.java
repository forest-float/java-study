package com.util.test;

public class Book {
	private String title;
	private double price;
	public Book(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public static int div(int x, int y) throws Exception{
		return x / y;
	}

	
}
