package com.util.tongbu;

class Mythread implements Runnable{

	private int Number = 5;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 20; i++) {
			synchronized (this) {//同步块
				if(this.Number > 0) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "卖了，还剩" + this.Number);
					this.Number --;
				}
			}
		}		
		
	}
	
}
//同步方法
class Mythreads implements Runnable{

	private int Number = 5;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 20; i++) {
			this.sale();//同步方法
		}		
		
	}
	public synchronized void sale() {//定义同步方法
		if(this.Number > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "卖了，还剩" + this.Number);
			this.Number --;
		}
		//super.wait();
		//super.notify();
		//super.notifyAll();
	}
	
}

public class Demo {
	public static void main(String[] args) {
		Mythread mythread = new Mythread();
		Thread mt1 = new Thread(mythread,"A");
		Thread mt2 = new Thread(mythread,"B");
		mt1.start();
		mt2.start();
		
		Mythreads mythreads = new Mythreads();
		Thread mt3 = new Thread(mythreads,"C");
		Thread mt4 = new Thread(mythreads,"D");
		mt3.start();
		mt4.start();
		
		
		
	}
	
}
