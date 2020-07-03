package com.util.RunnableTest;

class MyThread implements Runnable{
	private int values = 5;
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 50; i ++) {
			if(this.values > 0) {
				System.out.println("this is : " + this.values--);
			}
		}
		
	}
	
}

public class RunnableDemo {
	
	public static void main(String[] args) {
		MyThread mThread = new MyThread();
		new Thread(mThread).start();
		new Thread(mThread).start();
		new Thread(mThread).start();
		
	}

}
