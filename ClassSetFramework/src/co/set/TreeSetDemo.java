package co.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	//TreeSet����������༯��Ĭ������°�����ĸ����������
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Set<String> all = new TreeSet<String>();
		all.add("ccc");
		all.add("bbb");
		all.add("aaa");
		System.out.println("����" + all.size() + ",�Ƿ�Ϊ�գ�" + all.isEmpty());
		System.out.println(all);
		
		Set<Book> alls = new TreeSet<>();
		alls.add(new Book("java", 79.8));
		alls.add(new Book("python", 77.8));
		alls.add(new Book("c++", 89.8));
		System.out.println(alls);
	}

}
//TreeSet�����������Ƚ���ʵ�ֵ�
//���Ҫ����������Ķ�����ô���������������ʵ��java.lang.comparable
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
		// TODO �Զ����ɵķ������
		if(this.price > o.price) {
			return 1;
		}else if(this.price == o.price) {
			return 0;
		}else {
			return -1;
		}		
	}
	
}
