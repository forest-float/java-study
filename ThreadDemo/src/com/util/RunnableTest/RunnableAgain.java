package com.util.RunnableTest;

class RunnableMythread implements Runnable{
	private String name;
	
	public RunnableMythread(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for(int i = 0; i < 10000; i ++) {
			System.out.println(this.name);
			try {
				Thread.sleep(100);//�̵߳�����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class RunnableAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getPriority());//��ȡ��ǰ�̵߳����ȼ�  5 �е�
		
		RunnableMythread mt1 = new RunnableMythread("A");
		RunnableMythread mt2 = new RunnableMythread("B");
		Thread MT1 = new Thread(mt1);
		Thread MT2 = new Thread(mt2);
		MT2.setPriority(Thread.MAX_PRIORITY);//�������ȼ�
		MT1.start();
		MT2.start();
	}

}
