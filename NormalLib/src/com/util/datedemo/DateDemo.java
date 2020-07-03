package com.util.datedemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		long cur = System.currentTimeMillis();
		Date date = new Date(cur);//long 类型转换成Date类型
		System.out.println(date);
		System.out.println(date.getTime());//Date类型转换成long，类型
		
		//设置要转换成的格式
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm:ss");
		String str = simpleDateFormat.format(date);//将date类型转换成String类型
		
		System.out.println(str);
		Date date2 = simpleDateFormat.parse(str);
		System.out.println(date2);
		
		System.out.println(String.valueOf(false));//常见数据类型转string
		System.out.println(new Integer(10).toString());//
		System.out.println(Integer.toString(10));
		
		System.out.println(Integer.parseInt("10"));//String转常见类型
		System.out.println(Float.parseFloat("12.34"));
		System.out.println(Double.valueOf("123").doubleValue());
		
		System.out.println(str.charAt(4));
		
		char da[] = str.toCharArray();//String转字符数组
		
		for (char i : da) {
			System.out.print(Integer.toHexString(i)+"、");//用16进制显示
			System.out.println(Integer.toBinaryString(i)+"、");
		}
	}

}
