package com.util.threadtest;

//ʵ��Runnable�ӿ�ʵ�ֶ��߳�
public class MyThreads implements Runnable {

	private String name;
	
	public MyThreads(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 200; i ++) {
			System.out.println(this.name + "-->" + i);
		}
	}
	
	public static void main(String[] args) {
		MyThreads mt1 = new MyThreads("mt1");
		MyThreads mt2 = new MyThreads("mt2");
		MyThreads mt3 = new MyThreads("mt3");
		MyThreads mt4 = new MyThreads("mt4");
		// public Thread(Runnable target);//�вι��캯��
		
		new Thread(mt1).start();//����Thread�������߳�
		new Thread(mt2).start();
		new Thread(mt3).start();
		new Thread(mt4).start();
	}

}
