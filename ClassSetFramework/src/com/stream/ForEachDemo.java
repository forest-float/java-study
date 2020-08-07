package com.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 *  * 
 * @author Administrator
 *
 *	Streamʹ��һ��������SQL�������ݿ��ѯ���ݵ�ֱ�۷�ʽ���ṩһ�ֶ�Java��������ͱ��ĸ߽׳���.
 *	Stream�����Լ��ŵ�:
 *	�޴洢. Stream����һ�����ݽṹ,��ֻ��ĳ������Դ��һ����ͼ,����Դ������һ������,Java������I/O channel��.
 *	Ϊ����ʽ��̶���. ����Stream���κ��޸Ķ������޸ı��������Դ,�����Streamִ�й��˲���������ɾ�������˵�Ԫ��,���ǻ����һ�������������˵�Ԫ�ص���Stream
 *	��ʽִ��: Stream�ϵĲ�����������ִ��,ֻ�еȵ��û�������Ҫ�����ʱ��Ż�ִ��.
 *	��������: Streamֻ�ܱ�����һ��,һ����������ͻ�ʧЧ,���������ĵ�����һ��,��Ҫ�ٴα���������������.
 */

public class ForEachDemo {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		all.add("aaa");
		all.add("aaabbb");
		all.add("aaaccc");
		all.add("aaa");
		Collections.addAll(all, "ddd");
		System.out.println(all);
		all.forEach(System.out::print);
		System.out.println("\n");
		Stream<String> stream = all.stream();
		if(stream.anyMatch((x)->x.contains("aaa"))) {
			System.out.println("Ԫ�ش���");
		}
		
		//���ö������
		Predicate<String> p1 = (x)->x.contains("aaa");
		Predicate<String> p2 = (x)->x.contains("bbb");
		
		if(all.stream().anyMatch(p1.or(p2))) {
			System.out.println("Ԫ�ش���");
		}
		
		//System.out.println(stream.count());
		//stream.forEach(System.out::print);//�������Ҫʹ��streamת�����Ͳ��ܽ��иò�������Ȼ�ᱨ��
		
		//��Ϊֻ�ܽ���һ�Σ�һ��ʹ�ù��ˣ����޷�ʹ�õڶ���
		//List<String> newstream = stream.distinct().
		List<String> newstream = all.stream().distinct().//���ˣ�������������Ԫ�ع��˳���
				filter((x)->x.contains("aaa")).
				collect(Collectors.toList());
		newstream.forEach(System.out::println);
		
		
	}
}
