package com.util.threadtest;


//���߳�����ʵ�ַ���   �̳�Thread��   ʵ��Runnable�ӿ�

public class TestDemo {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread("mt1");
		MyThread mt2 = new MyThread("mt2");
		MyThread mt3 = new MyThread("mt3");
		MyThread mt4 = new MyThread("mt4");
	
		mt4.setPriority(10);
		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();

	}

}
