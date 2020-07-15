package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	//迭代器是输出集合中最常用的接口，在Collection中也提供了直接为Iterator
	//接口实例化的方法iterator(),、
	//任何集合类型的接口都可以转换为Iterator接口输出
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List<String> all = new ArrayList<String>();
		all.add("hello");
		all.add("hello word");
		all.add("world");
		
		Iterator<String> iterator = all.iterator();
		while (iterator.hasNext()) {//判断是否还有内容
			String str = iterator.next();//取出当前内容
			System.out.println(str);			
		}
	}

}
