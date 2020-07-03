package com.util.CallableTest;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class MyThread implements Callable<String>{ //���߳�������

	private int values = 10;
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		for(int i = 0; i < 50; i ++) {
			if(this.values > 0) {
				System.out.println("this is : " + this.values--);
			}
		}
		return "Ʊ������";
	}
	
}
public class CallableDemo {
	public static void main(String[] args) throws Exception {
		MyThread mThread1 = new MyThread();//ʵ�������̶߳���
		MyThread mThread2 = new MyThread();
		
		//FutureTask��Runnable�ӿ����࣬���Խ���Callable�ӿ�ʵ��
		FutureTask<String> task1 = new FutureTask<>(mThread1);
		FutureTask<String> task2 = new FutureTask<>(mThread2);
		
		new Thread(task1).start();//�����߳�
		new Thread(task2).start();
		
		//���߳�ִ�����֮����Ի�ȡ���ݣ���Future�е�get����ʵ��
		System.out.println("A�̷߳������ݣ�" + task1.get());
		System.out.println("B�̷߳������ݣ�" + task2.get());
		
	}

}
