package com.util.enumtest;

enum Sex {
	MALE("男"),FEMALE("女") ;
	private String title ;
	private Sex(String title) {
		this.title = title ;
	}
	public String toString() {
		return this.title ;
	}
}
class Member {
	private String name ;
	private int age ;
	private Sex sex ;			// 定义性别属性
	public Member(String name,int age,Sex sex) {
		this.name = name ;
		this.age = age ;
		this.sex = sex ;
	}
	public String toString() {
		return "姓名：" + this.name + "，年龄：" + this.age + "，性别：" + this.sex ;
	}
}


public class TestDemoClass {
	public static void main(String[] args) {
		System.out.println(new Member("李兴华", 36, Sex.MALE)); 
	}


}
