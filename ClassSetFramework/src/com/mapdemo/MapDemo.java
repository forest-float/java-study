package com.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Map<String, Integer> all = new HashMap<String, Integer>();
		all.put("aaa", 1);
		all.put("bbb", 2);
		all.put("ccc", 3);
		all.put("ddd", 4);
		all.put(null, null);//允许出现null  异步处理  非线程安全
		System.out.println(all.get("bbb"));
		System.out.println(all.get("ddd"));
		System.out.println(all);
	}

}
