package com.util.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Imessages<P,R>{
	public R zhaunhaun(P p);
}
@FunctionalInterface
interface Imessagess<R>{
	public R upper();
}
@FunctionalInterface
interface Imessagessss<C>{
	public C create(String title, double price);
}

@FunctionalInterface
interface Imessagesss<P>{
	public int compare(P p1, P p2);
}

class Book{
	private String title;
	private double price;
	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
}
//��������
public class TestDemo {
	public static void main(String[] args) {	
		//���þ�̬����
		Imessages<Integer, String> msg = String::valueOf;
		String str = msg.zhaunhaun(1000);
		System.out.println(str.replaceAll("0","9"));
		
		//������ͨ����
		Imessagess<String>  imessagess = "yootk"::toUpperCase;
		System.out.println(imessagess.upper());
		
		//�����ض���ķ���
		Imessagesss<String> mImessagesss = String::compareTo;
		System.out.println(mImessagesss.compare("A", "B"));
		
		//���ù��췽��
		Imessagessss<Book> imessagessss = Book::new;
		Book book = imessagessss.create("java��������", 79.8);
		System.out.println(book.toString());
		
		
		//�ڽ�����ʽ�ӿ�
		//�����ͽӿ�  Function   apply
		Function<String, Boolean> function = "##yootk"::startsWith;
		System.out.println(function.apply("##"));
		//�����ͽӿ�  Consumer  accept
		Consumer<String> cons = System.out::println;
		cons.accept("hello"); 
		//�����ͽӿ�  Supplier  get
		Supplier<String> supplier = "yootk"::toUpperCase;
		System.out.println(supplier.get());	
		//�����ͽӿ�  Predicate  test
		Predicate<String> predicate = "yootk"::equalsIgnoreCase;
		System.out.println(predicate.test("YOOTK"));
	}
}
