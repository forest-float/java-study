package com.util.comparedemo;

import java.util.Arrays;

class Book implements Comparable<Book>{
	private int pirce;
	
	public Book(int pirce) {
		super();
		this.pirce = pirce;
	}

	public int getPirce() {
		return pirce;
	}

	public void setPirce(int pirce) {
		this.pirce = pirce;
	}

	@Override
	public String toString() {
		return "Book [pirce=" + pirce + "]";
	}

	@Override
	public int compareTo(Book o) {//arrays.sort()会自动调用这个函数进行比较
		// TODO Auto-generated method stub
		if(this.pirce > o.pirce) {
			return 1;
		}else if(this.pirce == o.pirce) {
			return 0;
		}else {
			return -1;
		}		
	}
	
}


public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book books[] = new Book[] {
			new Book(10),
			new Book(20),
			new Book(1),
			new Book(3)
		};
		Arrays.sort(books);
		System.out.println(Arrays.toString(books));
	}

}
