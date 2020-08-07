package com.stack;

import java.util.Stack;
//ջ
public class StackDemo {
	public static void main(String[] args) {
		Stack<String> all = new Stack<>();
		all.push("aaa");
		all.push("bbb");
		all.push("ccc");
		all.push("ddd");
		System.out.println(all.pop());
		System.out.println(all.pop());
		System.out.println(all.pop());
		System.out.println(all.pop());
	}
}
