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
		//all.put(null, null);//���������null  ͬ������  �̰߳�ȫ 
		System.out.println(all);
		
		//���ϵ����Ҫ����Iterator�ӿ����
		//1.��mapת����Set�ӿ�
		Set<Map.Entry<String, Integer>> set = all.entrySet();
		//��set����ת����iterator�ӿ�
		Iterator<Map.Entry<String, Integer>> iter = set.iterator();
		while(iter.hasNext()) {
			//��ÿ�ε�������������ת���ӿ�ʵ����
			Map.Entry<String, Integer> mEntry = iter.next();
			//ͨ��getkey��getvalue�����������ݷ������
			System.out.println(mEntry.getKey() + " = " + mEntry.getValue());
		}
	}
}
//���Ҫʹ���Զ���ģ�������Ϊkey,����븲дhasCode��equals
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
