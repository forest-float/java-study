package com.util.threadtest;

// 继承Thread类 显现多线程
public class MyThread extends Thread{
	private String name;	
	
	public MyThread(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for(int i = 0; i < 200; i ++) {
			System.out.println(this.name + "-->" + i);
		}
		
	}

}
