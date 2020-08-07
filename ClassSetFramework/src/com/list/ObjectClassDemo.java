package com.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ObjectClassDemo {
	//ArrayList中保存的数据是可变的，Array中保存的数据是可变的
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List<Book> all = new ArrayList<Book>();
		all.add(new Book("aaa", 98.6));
		all.add(new Book("bbb", 98.6));
		all.add(new Book("ccc", 98.6));
		all.remove(2);
		Collections.addAll(all, new Book("ccc",98.6));
		//collections工具类
		System.out.println(all);
	}

}
class Book{
	private String title;
	private double price;
	public Book(String title, double price) {
		
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	@Override
	public boolean equals(Object anObject) {
		if(this == anObject) {
			return true;
		}
		if(anObject == null) {
			return false;
		}
		Book book = (Book) anObject;
		if(this.title.equals(book.title) && this.price == book.price) {
			return true;
		}		
		return false;
	}	
}
