package com.mapdemo;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableDemo {
	public static void main(String[] args) {
		Map<String, Integer> all = new Hashtable<>();
		all.put("aaa", 1);
		all.put("bbb", 2);
		all.put("ccc", 3);
		all.put("ddd", 4);
		//all.put(null, null);//不允许出现null  同步处理  线程安全 
		System.out.println(all);
		
		//集合的输出要利用Iterator接口完成
		//1.将map转换成Set接口
		Set<Map.Entry<String, Integer>> set = all.entrySet();
		//将set集合转换成iterator接口
		Iterator<Map.Entry<String, Integer>> iter = set.iterator();
		while(iter.hasNext()) {
			//将每次迭代出来的数据转到接口实例中
			Map.Entry<String, Integer> mEntry = iter.next();
			//通过getkey和getvalue来讲两种数据分离出来
			System.out.println(mEntry.getKey() + " = " + mEntry.getValue());
		}
	}
}
//如果要使用自定义的，类型作为key,则必须覆写hasCode和equals
class Book{
	private String title;

	public Book(String title) {
		super();
		this.title = title;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Book other = (Book) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}
	
}
