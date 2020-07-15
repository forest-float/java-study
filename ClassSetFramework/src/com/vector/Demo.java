package com.vector;

import java.util.List;
import java.util.Vector;
//允许重复
public class Demo {
	//Vector和ArrayList子类的区别就是Vector类中的部分方法，使用了synchronized关键字（同步操作）
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List<String> all = new Vector<String>();
		all.add("aaa");
		all.add("bbb");
		all.add("ccc");
		System.out.println("长度" + all.size() + ",是否为空：" + all.isEmpty());
		for (int i = 0; i < all.size(); i++) {
			String string = all.get(i);
			System.out.println(string);
		}
		all.set(1,"ddd");
		System.out.println(all.get(1));
	}

}
