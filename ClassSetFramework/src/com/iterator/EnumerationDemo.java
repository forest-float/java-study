package com.iterator;

import java.util.Enumeration;
import java.util.Vector;
//ö���������������Vector����
public class EnumerationDemo {
	public static void main(String[] args) {
		Vector<String> all = new Vector<String>();
		all.add("aaa");
		all.add("bbb");
		all.add("ccc");
		Enumeration<String> enumerat = all.elements();
		while(enumerat.hasMoreElements()) {
			String str = enumerat.nextElement();
			System.out.println(str);
		}
	}
}
