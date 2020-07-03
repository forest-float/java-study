package com.util.threadtest;

class MyThreadss extends Thread{
	private String name;	
	
	public MyThreadss(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		
		for(int i = 100; i > 0; i --) {
			System.out.println("the thread is " + this.name);
			
		}			
	}	
}

public class ThreadsDemo {
	public static void main(String[] args) {
		MyThreadss mt1 = new MyThreadss("A");
		MyThreadss mt2 = new MyThreadss("B");
		mt1.start();
		mt2.start();
	}
	
	
}
