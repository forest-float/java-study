package com.iterator;

import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;

//双向迭代
public class ListIteratorDemo {
	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		all.add("hello");
		all.add("hello word");
		all.add("world");
		
		ListIterator<String> iterator = all.listIterator();
		while (iterator.hasNext()) {//判断是否还有内容  向后迭代
			String str = iterator.next();//取出当前内容
			System.out.println(str);			
		}
		while(iterator.hasPrevious()) {//向前迭代
			String pri = iterator.previous();
			System.out.println(pri);
		}
		
	}
}
