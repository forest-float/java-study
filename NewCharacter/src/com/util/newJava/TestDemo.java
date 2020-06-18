package com.util.newJava;

public class TestDemo {
	public static void main(String[] args) {
		System.out.println(add(new int[]{1,2,3,4,5,6}));
		System.out.println(adds(new int[]{1,2,3,4}));
		
		
		//即使不使用泛型类型，也会出现错误，但执行的时候如果类型错误，才会出错
		//为了保证设计的合理性，如果不设置泛型类型，会使用Object类型
		Fanxing<String> pFanxing = new Fanxing<String>();
		pFanxing.setxT("东经100度");
		pFanxing.setyT("北纬20度");
		
		String x = pFanxing.getxT();
		String y = pFanxing.getyT();
		System.out.println(x + ": " + y);
		
		//定义了传进去的类型，如果类型失败，直接编译失败
		Fanxing<Integer> pFanxings = new Fanxing<Integer>();
		pFanxings.setxT(10);
		pFanxings.setyT(10);
		
		int xs = pFanxings.getxT();
		int ys = pFanxings.getyT();
		System.out.println(xs + ": " + ys);
	}
	//使用通配符“？”，解决参数传递问题，防止泛型类型的参数传递出现错误
	//public static void fun(Fanxing<String> temp){
	//public static void fun(Fanxing<Integer> temp){
	//使用通配符的意义在于可以接受类对象，但是不能修改对象属性
	//public static void fun(Fanxing temp){
	//如果不指派泛型类型，则默认为Object类型，方法里可以随意修改属性内容
	public static void fun(Fanxing<?> temp){
		System.out.println(temp.getxT());
	}
	
	public static int add(int ... data){//可变参数，实际传递多个参数，接收到数组
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum;
	}
	
	public static int adds(int ... data){
		int sum = 0;
		for (int i : data) {//foreach循环   for循环的加强型
			sum += i;
		}
		return sum;
	}

	//设置泛型上限   只能是Number或者Number子类
	//class Message<T extends Number>
	//public static void fun(Message<? extends Number> temp)
	
	//设置类型下限 只能是String或者Object父类
	//public static void fun(<? super String> temp)
	
	
}
