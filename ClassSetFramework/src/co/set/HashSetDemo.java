package co.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.sun.corba.se.impl.presentation.rmi.IDLNameTranslatorImpl;

//Set类不允许保存重复的数据，且无法通过方法get()找到索引，找到保存的数据

public class HashSetDemo {

	//hashSet是散列存放数据，没有排序
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Set<String> all = new HashSet<String>();
		all.add("ccc");
		all.add("bbb");
		all.add("aaa");
		System.out.println("长度" + all.size() + ",是否为空：" + all.isEmpty());
		System.out.println(all);
		
		Set<Books> alls = new TreeSet<>();
		alls.add(new Books("java", 79.8));
		alls.add(new Books("python", 77.8));
		alls.add(new Books("c++", 89.8));
		System.out.println(alls);
	}

}
//关于重复问题
class Books{
	private String title;
	private double price;
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}

	public Books(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	
}