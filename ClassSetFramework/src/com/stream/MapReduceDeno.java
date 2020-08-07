package com.stream;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

class Orders{
	private String name;
	private double price;
	private int amount;
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getAmount() {
		return amount;
	}
	@Override
	public String toString() {
		return "Orders [name=" + name + ", price=" + price + ", amount=" + amount + "]";
	}
	public Orders(String name, double price, int amount) {
		super();
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	
}

public class MapReduceDeno {
	public static void main(String[] args) {
		List<Orders> all = new ArrayList<Orders>();
		all.add(new Orders("book 1", 1.0, 100));
		all.add(new Orders("book 2", 2.0, 200));
		all.add(new Orders("book 3", 3.0, 300));
		//函数式接口，lambda函数
		all.stream().map((x)->x.getAmount()*x.getPrice()).
		forEach(System.out::println);
		
		double allPrice = all.stream().map((x)->x.getAmount()*x.getPrice()).
				reduce((sum, m)->sum+m).get();
		//利用reduce方法进行求和运算，然后利用lambda表达式实现数据结果的累加
		System.out.println(allPrice);
		
		
		DoubleSummaryStatistics dss = all.stream().mapToDouble((x)->x.getAmount()*
				x.getPrice()).summaryStatistics();
		System.out.println(dss.getCount());
		System.out.println(dss.getAverage());
		System.out.println(dss.getSum());
		System.out.println(dss.getMax());
		System.out.println(dss.getMin());
	}

}
