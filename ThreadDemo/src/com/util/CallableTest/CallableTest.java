package com.util.CallableTest;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class MyThreads implements Callable<String>{
	private int num = 1000;
	private String name;
	
	public MyThreads(String name) {
		super();
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			System.out.println(this.name + " is Number " + this.num--);
			Thread.sleep(1000);
		}
		
		return this.name + "½áÊø";
	}
	
}

public class CallableTest {
	public static void main(String[] args) throws Exception{
		MyThreads mt1 = new MyThreads("A");
		MyThreads mt2 = new MyThreads("B");
		
		FutureTask<String> task1 = new FutureTask<>(mt1);
		FutureTask<String> task2 = new FutureTask<>(mt2);
		
		new Thread(task1).start();
		new Thread(task2).start();
		
		System.out.println(task1.get());
		System.out.println(task2.get());
	}

}
