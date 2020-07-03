package com.util.clonedemo;

class Book implements Cloneable{
	private String title;
	private double price;
	public Book(String title, double price) {
		super();
		this.title = title;
		this.price = price;
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
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	//由于此类对象需要对象克隆操作，因此才需要覆写该方法
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}


public class CloneDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Book bookA = new Book("java开发", 79.8);//实例化新对象
		Book bookB = (Book)bookA.clone();//克隆对象，开辟新的堆内存空间
		bookB.setTitle("JSP");//修改对象的值
		System.out.println(bookB.toString());//显示修改后的对象的信息		
	}

}
