package co.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	//TreeSet属于排序的类集，默认情况下按照字母的升序排列
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Set<String> all = new TreeSet<String>();
		all.add("ccc");
		all.add("bbb");
		all.add("aaa");
		System.out.println("长度" + all.size() + ",是否为空：" + all.isEmpty());
		System.out.println(all);
		
		Set<Book> alls = new TreeSet<>();
		alls.add(new Book("java", 79.8));
		alls.add(new Book("python", 77.8));
		alls.add(new Book("c++", 89.8));
		System.out.println(alls);
	}

}
//TreeSet排序是依靠比较器实现的
//如果要保存任意类的对象，那么对象所处的类必须实现java.lang.comparable
class Book implements Comparable<Book>{

	private String title;
	private double price;
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}

	public Book(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}

	@Override
	public int compareTo(Book o) {
		// TODO 自动生成的方法存根
		if(this.price > o.price) {
			return 1;
		}else if(this.price == o.price) {
			return 0;
		}else {
			return -1;
		}		
	}
	
}
