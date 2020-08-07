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
 *	Stream使用一种类似用SQL语句从数据库查询数据的直观方式来提供一种对Java集合运算和表达的高阶抽象.
 *	Stream的特性及优点:
 *	无存储. Stream不是一种数据结构,它只是某种数据源的一个视图,数据源可以是一个数组,Java容器或I/O channel等.
 *	为函数式编程而生. 对于Stream的任何修改都不会修改背后的数据源,比如对Stream执行过滤操作并不会删除被过滤的元素,而是会产生一个不包含被过滤掉元素的新Stream
 *	惰式执行: Stream上的操作不回立即执行,只有等到用户真正需要结果的时候才会执行.
 *	可消费性: Stream只能被消费一次,一旦遍历过后就会失效,就像容器的迭代器一样,想要再次遍历必须重新生成.
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
			System.out.println("元素存在");
		}
		
		//设置多个条件
		Predicate<String> p1 = (x)->x.contains("aaa");
		Predicate<String> p2 = (x)->x.contains("bbb");
		
		if(all.stream().anyMatch(p1.or(p2))) {
			System.out.println("元素存在");
		}
		
		//System.out.println(stream.count());
		//stream.forEach(System.out::print);//如果下面要使用stream转换，就不能进行该操作，不然会报错
		
		//因为只能接受一次，一旦使用过了，就无法使用第二次
		//List<String> newstream = stream.distinct().
		List<String> newstream = all.stream().distinct().//过滤，将满足条件的元素过滤出来
				filter((x)->x.contains("aaa")).
				collect(Collectors.toList());
		newstream.forEach(System.out::println);
		
		
	}
}
