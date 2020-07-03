package com.util.CallableTest;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class CallableMythread implements Callable<String>{
	private String name;
	
	@Override
	public String call() throws Exception{
		for (int i = 0; i < 1000; i++) {
			System.out.println(this.name);
			Thread.sleep(1000);
		}
		return this.name + "½áÊø";
	}

	public CallableMythread(String name) {
		super();
		this.name = name;
	}
}

public class CallableAgain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CallableMythread mt1 = new CallableMythread("A");
		CallableMythread mt2 = new CallableMythread("B");
		
		FutureTask<String> task1 = new FutureTask<>(mt1);
		FutureTask<String> task2 = new FutureTask<>(mt2);
		
		new Thread(task1).start();
		new Thread(task2).start();
		
		System.out.println(task1.get());
		System.out.println(task2.get());
	}

}
