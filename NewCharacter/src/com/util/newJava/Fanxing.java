package com.util.newJava;

public class Fanxing<T> {//使用泛型修改类    T是type的标记，表示一个类型标记
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
	public class Fanxingmore<S, R>{//可以一次性定义多个泛型标记
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
	//@Deprecated声明过期操作
	
	//定义泛型方法
	public static <T> T fun(T t){
		return t;
	}
	//String str = fun("hello");
}
//在JDK1.8之后，可以在接口中定义普通方法(default修饰)和静态方法(static修饰)