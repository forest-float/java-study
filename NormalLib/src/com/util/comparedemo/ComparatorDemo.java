package com.util.comparedemo;

import java.util.Arrays;
import java.util.Comparator;

class Books {
	private String title;
	private double price;
	public Books(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}	
}
class BookComparator implements Comparator<Books>{

	@Override
	public int compare(Books o1, Books o2) {
		// TODO Auto-generated method stub
		if(o1.getPrice() > o2.getPrice()) {
			return 1;
		}else if(o1.getPrice() == o2.getPrice()) {
			return 0;
		}else {
			return -1;
		}		
	}
	
}

public class ComparatorDemo {

	public static void main(String[] args) {
		Books[] books = new Books[] {
				new Books("aaa", 45.0),
				new Books("bbb", 24.0),
				new Books("ccc", 12.0)
		};
		java.util.Arrays.sort(books, new BookComparator());
		System.out.println(Arrays.toString(books));
		
		//也可以用labmda表达式来实现排序
		Arrays.sort(books,(o1,o2)->{
			if(o1.getPrice() > o2.getPrice()) {
				return 1;
			}else if(o1.getPrice() == o2.getPrice()) {
				return 0;
			}else {
				return -1;
			}	
		});
		System.out.println(Arrays.toString(books));
	}
}
