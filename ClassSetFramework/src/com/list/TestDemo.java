package com.list;

import java.util.ArrayList;
import java.util.List;


public class TestDemo {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		System.out.println("����" + all.size() + ",�Ƿ�Ϊ�գ�" + all.isEmpty());
		all.add("aaa");
		all.add("bbb");
		all.add("ccc");
		System.out.println("����" + all.size() + ",�Ƿ�Ϊ�գ�" + all.isEmpty());
		for (int i = 0; i < all.size(); i++) {
			String string = all.get(i);
			System.out.println(string);
		}
		all.set(1,"ddd");
		System.out.println(all.get(1));
	}
}
