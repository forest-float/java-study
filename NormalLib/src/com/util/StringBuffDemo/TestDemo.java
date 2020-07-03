package com.util.StringBuffDemo;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer();
		buffer.append("hello world");
		change(buffer);
		System.out.println(buffer);
		
		String st = buffer.toString();//将StringBuff类转变为String   或者利用构造方法
		System.out.println(st);
		
		System.out.println(buffer.reverse());//反转
		System.out.println(buffer.insert(3, "insert "));//插入
		System.out.println(buffer.delete(3, 9));//删除
		
	}
	public static void change(StringBuffer bf) {
		bf.append("\n").append("hello");
	}
}
