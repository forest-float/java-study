package com.util.SystemDemo;

public class SystemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//计算某样操作花费的时间
		long start = System.currentTimeMillis();
		@SuppressWarnings("unused")
		String str = "";
		for (int i = 0; i < 1000; i++) {
			str += i;
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		System.gc();//手工处理垃圾收集
	}
	//表示对象收尾的时候执行的一些操作，覆写Object类方法
	//Throwable表示出现异常或者错误都不会导致程序中断
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("class is end");
		throw new Exception("表示出现异常或者错误都不会导致程序中断");
	}

}
