package com.uitl.fanshe;

import java.lang.reflect.Constructor;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class FansheDemo {

	public static void main(String[] args) throws Exception {
		Date date = new Date();//��ȡʱ�����ݶ���
		System.out.println(date);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm:ss");
		//����ת����ʽ
		String datel = dateFormat.format(date);//��date������ת����ʽת����String
		System.out.println(datel);
		System.out.println(dateFormat.parse(datel));//��String������ת����ʽת����String��ʽ
		System.out.println(date.getTime());//��dateת��long ����
		System.out.println(System.currentTimeMillis());//ʹ��System��ķ�����ȡ��ǰʱ��
		
		
		
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
		Class<?> class1 = date.getClass();//���ͱ��+ͨ���
		System.out.println(class1.getName());
		//second   ʹ�á���.class��ȡ�ã�����Ҫָ�����ʵ��������
		Class<?> class2 = Date.class;
		System.out.println(class2.getName());
		//third  ֱ�ӵ�����ķ���  class.forName(classname) ����������·��		
		Class<?> class3 = Class.forName("java.util.Date");
		System.out.println(class3.getName());
		
	}
	
	//���÷���ʵ��������
	public static void reflexInstantiate() throws Exception {
		Class<?> class3 = Class.forName("com.uitl.fanshe.Book");
		Object object = class3.newInstance();
		Book book = (Book)object;
		System.out.println(book);		
	}
	
	//ʹ�÷�����ù���
	public static void reflexInstantiates() throws Exception {
		Class<?> class3 = Class.forName("com.uitl.fanshe.Book");
		//��ȷ�ҵ�Book���е������������Ĺ��캯��
		Constructor<?> constructor = class3.getConstructor(String.class,double.class);
		Object object = constructor.newInstance("hello java",78.9);
		System.out.println(object);
	}
	
	//ʹ�÷���򵥲���������
	public static void reflexInstantiatess() throws Exception {
		String fieldName = "title";
		Class<?> class3 = Class.forName("com.uitl.fanshe.Book");
		//��ȷ�ҵ�Book���е������������Ĺ��캯��
		Constructor<?> constructor = class3.getConstructor(String.class,double.class);
		Object object = constructor.newInstance("hello java",78.9);//ʵ��������
		Method setMet = class3.getMethod("set" + initcap(fieldName), String.class);
		//ȡ��settitle����
		setMet.invoke(object, "javakaifa");//�൱��settitle
		System.out.println(object);
	}
	public static String initcap(String str) {
		return str.substring(0,1).toUpperCase()+str.substring(1);
	}
	
	//���÷���ֱ�Ӳ���˽�г�Ա
	public static void getDirect() throws Exception {
		Class<?> class3 = Class.forName("com.uitl.fanshe.Book");
		Object object = class3.newInstance();
		Field titlefield = class3.getDeclaredField("title");
		//ȡ�����е�����
		titlefield.setAccessible(true);//ȡ����װ
		titlefield.set(object, "java get title");//�൱��title= ������
		System.out.println(object);
		System.out.println(titlefield.get(object));//��ȡtitle��ֵ
	}
}
//���÷���ʵ��������
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
		System.out.println("book���޲ι��캯��");
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
}
