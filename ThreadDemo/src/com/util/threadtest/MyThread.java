package com.util.threadtest;

// �̳�Thread�� ���ֶ��߳�
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
