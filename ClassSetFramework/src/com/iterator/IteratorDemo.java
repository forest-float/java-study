package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	//�������������������õĽӿڣ���Collection��Ҳ�ṩ��ֱ��ΪIterator
	//�ӿ�ʵ�����ķ���iterator(),��
	//�κμ������͵Ľӿڶ�����ת��ΪIterator�ӿ����
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		List<String> all = new ArrayList<String>();
		all.add("hello");
		all.add("hello word");
		all.add("world");
		
		Iterator<String> iterator = all.iterator();
		while (iterator.hasNext()) {//�ж��Ƿ�������
			String str = iterator.next();//ȡ����ǰ����
			System.out.println(str);			
		}
	}

}
