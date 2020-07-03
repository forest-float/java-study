package com.util.RuntimeDemo;

public class RuntimeDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		String str = "";
		for (int i = 0; i < 1000; i++) {
			str += i;
		}
		Runtime run = Runtime.getRuntime();//取得类的实例化对象
		System.out.println(run.maxMemory());//取得最大可用内存
		System.out.println(run.totalMemory());//取得全部可用内存
		System.out.println(run.freeMemory());//取得空闲内存
		
		run.gc();//释放垃圾空间
		System.out.println(run.maxMemory());//取得最大可用内存
		System.out.println(run.totalMemory());//取得全部可用内存
		System.out.println(run.freeMemory());//取得空闲内存
		
		
		Process pro = run.exec("mspaint.exe");//调用可执行程序
		Thread.sleep(20000);//运行两秒后自动关闭
		pro.destroy();//销毁进程
	}

}
