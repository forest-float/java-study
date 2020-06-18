package com.util.lambda;

interface IMessage{
	public void print();
}

public class LambdaDemo {

	public static void main(String[] args) {
		//Lambda���ʽ
		fun( () -> {System.out.println("lambda");System.out.println("lambda");});//java1.8
		fun( () -> System.out.println("lambda"));//java1.8
		//fun((s1,s2)->s1+s2);
		fun(new IMessage() {//�����ڲ�����
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("lambda");
			}
		});
	}
	public static void fun(IMessage msg){
		msg.print();
	}
}
