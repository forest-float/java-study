package com.util.threadtest;

class NewMythread extends Thread{
	private String name;
	
	
	public NewMythread(String name) {
		super();
		this.name = name;
	}


	@Override
	public void run() {
		for(int i = 0; i < 1000; i ++) {
			System.out.println(this.name);
		}
		
	}
	
}

public class ThreadAgain {
	public static void main(String[] args) {
		NewMythread mt1 = new NewMythread("A");
		NewMythread mt2 = new NewMythread("B");
		mt1.start();
		mt2.start();
	}
	
}
