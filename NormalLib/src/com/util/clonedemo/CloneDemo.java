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
	//���ڴ��������Ҫ�����¡��������˲���Ҫ��д�÷���
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}


public class CloneDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Book bookA = new Book("java����", 79.8);//ʵ�����¶���
		Book bookB = (Book)bookA.clone();//��¡���󣬿����µĶ��ڴ�ռ�
		bookB.setTitle("JSP");//�޸Ķ����ֵ
		System.out.println(bookB.toString());//��ʾ�޸ĺ�Ķ������Ϣ		
	}

}
