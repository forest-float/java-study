package com.iterator;

import java.util.ArrayList;
import java.util.List;

public class ForeachDemo {
	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		all.add("hello");
		all.add("hello word");
		all.add("world");
		for (String string : all) {
			System.out.println(string);
		}
	}
}
