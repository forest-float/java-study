package com.util.RunnableTest;

class MyThreads implements Runnable{

	private int Number = 1000;
	private String name;
	
	public MyThreads(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 1000; i ++) {
			System.out.println(this.name + " is Number " + this.Number--);
		}		
	}
	
}

public class RunnableTest {
	public static void main(String[] args) {
		MyThreads mt1 = new MyThreads("A");
		MyThreads mt2 = new MyThreads("B");
		new Thread(mt1).start();
		new Thread(mt2).start();
	}
	
	
	

}
