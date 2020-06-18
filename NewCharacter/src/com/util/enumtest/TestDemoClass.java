package com.util.enumtest;

enum Sex {
	MALE("��"),FEMALE("Ů") ;
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
	private Sex sex ;			// �����Ա�����
	public Member(String name,int age,Sex sex) {
		this.name = name ;
		this.age = age ;
		this.sex = sex ;
	}
	public String toString() {
		return "������" + this.name + "�����䣺" + this.age + "���Ա�" + this.sex ;
	}
}


public class TestDemoClass {
	public static void main(String[] args) {
		System.out.println(new Member("���˻�", 36, Sex.MALE)); 
	}


}
