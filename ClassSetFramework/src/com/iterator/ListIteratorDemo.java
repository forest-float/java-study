package com.iterator;

import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;

//˫�����
public class ListIteratorDemo {
	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		all.add("hello");
		all.add("hello word");
		all.add("world");
		
		ListIterator<String> iterator = all.listIterator();
		while (iterator.hasNext()) {//�ж��Ƿ�������  ������
			String str = iterator.next();//ȡ����ǰ����
			System.out.println(str);			
		}
		while(iterator.hasPrevious()) {//��ǰ����
			String pri = iterator.previous();
			System.out.println(pri);
		}
		
	}
}
