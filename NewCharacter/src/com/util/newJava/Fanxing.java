package com.util.newJava;

public class Fanxing<T> {//ʹ�÷����޸���    T��type�ı�ǣ���ʾһ�����ͱ��
	private T xT;
	private T yT;
	public T getxT() {
		return xT;
	}
	public void setxT(T xT) {
		this.xT = xT;
	}
	public T getyT() {
		return yT;
	}
	public void setyT(T yT) {
		this.yT = yT;
	}
	public class Fanxingmore<S, R>{//����һ���Զ��������ͱ��
		private S xT;
		private R yR;
		public S getxT() {
			return xT;
		}
		public void setxT(S xT) {
			this.xT = xT;
		}
		public R getyR() {
			return yR;
		}
		public void setyR(R yR) {
			this.yR = yR;
		}
		
		
	}
	//@Deprecated�������ڲ���
	
	//���巺�ͷ���
	public static <T> T fun(T t){
		return t;
	}
	//String str = fun("hello");
}
//��JDK1.8֮�󣬿����ڽӿ��ж�����ͨ����(default����)�;�̬����(static����)