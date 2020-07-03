package com.util.CallableTest;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class MyThread implements Callable<String>{ //多线程主体类

	private int values = 10;
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		for(int i = 0; i < 50; i ++) {
			if(this.values > 0) {
				System.out.println("this is : " + this.values--);
			}
		}
		return "票已卖光";
	}
	
}
public class CallableDemo {
	public static void main(String[] args) throws Exception {
		MyThread mThread1 = new MyThread();//实例化多线程对象
		MyThread mThread2 = new MyThread();
		
		//FutureTask是Runnable接口子类，可以接受Callable接口实例
		FutureTask<String> task1 = new FutureTask<>(mThread1);
		FutureTask<String> task2 = new FutureTask<>(mThread2);
		
		new Thread(task1).start();//启动线程
		new Thread(task2).start();
		
		//多线程执行完毕之后可以获取内容，用Future中的get方法实现
		System.out.println("A线程返回数据：" + task1.get());
		System.out.println("B线程返回数据：" + task2.get());
		
	}

}
