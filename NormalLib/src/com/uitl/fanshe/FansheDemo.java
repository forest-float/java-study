package com.uitl.fanshe;

import java.lang.reflect.Constructor;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class FansheDemo {

	public static void main(String[] args) throws Exception {
		Date date = new Date();//获取时间数据对象
		System.out.println(date);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm:ss");
		//设置转换格式
		String datel = dateFormat.format(date);//将date对象按照转换格式转换成String
		System.out.println(datel);
		System.out.println(dateFormat.parse(datel));//将String对象按照转换格式转换成String格式
		System.out.println(date.getTime());//将date转换long 类型
		System.out.println(System.currentTimeMillis());//使用System类的方法获取当前时间
		
		
		
		directreReflexInsert();
		reflexInstantiate();
		reflexInstantiates();
		reflexInstantiatess();
		getDirect();
	}
	//just direct reflex
	public static void directReflex()
	{
		Date date = new Date();//product instantiate object
		System.out.println(date.getClass());//direct reflex output
	}
	
	public static void directreReflexInsert() throws Exception {
		//in total three kinds of instantiate object ways
		Date date = new Date();
		//first 
		Class<?> class1 = date.getClass();//泛型编程+通配符
		System.out.println(class1.getName());
		//second   使用“类.class”取得，不需要指定类的实例化对象
		Class<?> class2 = Date.class;
		System.out.println(class2.getName());
		//third  直接调用类的方法  class.forName(classname) 必须是完整路径		
		Class<?> class3 = Class.forName("java.util.Date");
		System.out.println(class3.getName());
		
	}
	
	//利用反射实例化对象
	public static void reflexInstantiate() throws Exception {
		Class<?> class3 = Class.forName("com.uitl.fanshe.Book");
		Object object = class3.newInstance();
		Book book = (Book)object;
		System.out.println(book);		
	}
	
	//使用反射调用构造
	public static void reflexInstantiates() throws Exception {
		Class<?> class3 = Class.forName("com.uitl.fanshe.Book");
		//明确找到Book类中的有两个参数的构造函数
		Constructor<?> constructor = class3.getConstructor(String.class,double.class);
		Object object = constructor.newInstance("hello java",78.9);
		System.out.println(object);
	}
	
	//使用反射简单操作类属性
	public static void reflexInstantiatess() throws Exception {
		String fieldName = "title";
		Class<?> class3 = Class.forName("com.uitl.fanshe.Book");
		//明确找到Book类中的有两个参数的构造函数
		Constructor<?> constructor = class3.getConstructor(String.class,double.class);
		Object object = constructor.newInstance("hello java",78.9);//实例化对象
		Method setMet = class3.getMethod("set" + initcap(fieldName), String.class);
		//取得settitle方法
		setMet.invoke(object, "javakaifa");//相当于settitle
		System.out.println(object);
	}
	public static String initcap(String str) {
		return str.substring(0,1).toUpperCase()+str.substring(1);
	}
	
	//利用反射直接操作私有成员
	public static void getDirect() throws Exception {
		Class<?> class3 = Class.forName("com.uitl.fanshe.Book");
		Object object = class3.newInstance();
		Field titlefield = class3.getDeclaredField("title");
		//取得类中的属性
		titlefield.setAccessible(true);//取消封装
		titlefield.set(object, "java get title");//相当于title= “”；
		System.out.println(object);
		System.out.println(titlefield.get(object));//获取title的值
	}
}
//利用反射实例化对象
class Book{

	private String title;
	private double price;
	
	public Book(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("book的无参构造函数");
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
}
