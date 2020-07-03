package com.uitl.regular;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp = "abc123hello";
		System.out.println(isNumber(temp));//自己编写的函数
		
		//使用正则表达式
		System.out.println(temp.matches("^[abc]{1,}\\d+\\S+"));
	}
	public static boolean isNumber(String temp) {
		if(temp == null || "".equals(temp)) {
			return false;
		}
		char data[] = temp.toCharArray();
		for (int i = 0; i < data.length; i++) {
			if(data[i] > '9' || data[i] < '0') {
				return false;
			}
		}
		return true;
	}

}
