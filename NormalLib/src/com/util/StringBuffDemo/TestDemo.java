package com.util.StringBuffDemo;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer();
		buffer.append("hello world");
		change(buffer);
		System.out.println(buffer);
		
		String st = buffer.toString();//��StringBuff��ת��ΪString   �������ù��췽��
		System.out.println(st);
		
		System.out.println(buffer.reverse());//��ת
		System.out.println(buffer.insert(3, "insert "));//����
		System.out.println(buffer.delete(3, 9));//ɾ��
		
	}
	public static void change(StringBuffer bf) {
		bf.append("\n").append("hello");
	}
}
