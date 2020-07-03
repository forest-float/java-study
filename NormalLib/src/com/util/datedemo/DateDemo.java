package com.util.datedemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		long cur = System.currentTimeMillis();
		Date date = new Date(cur);//long ����ת����Date����
		System.out.println(date);
		System.out.println(date.getTime());//Date����ת����long������
		
		//����Ҫת���ɵĸ�ʽ
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm:ss");
		String str = simpleDateFormat.format(date);//��date����ת����String����
		
		System.out.println(str);
		Date date2 = simpleDateFormat.parse(str);
		System.out.println(date2);
		
		System.out.println(String.valueOf(false));//������������תstring
		System.out.println(new Integer(10).toString());//
		System.out.println(Integer.toString(10));
		
		System.out.println(Integer.parseInt("10"));//Stringת��������
		System.out.println(Float.parseFloat("12.34"));
		System.out.println(Double.valueOf("123").doubleValue());
		
		System.out.println(str.charAt(4));
		
		char da[] = str.toCharArray();//Stringת�ַ�����
		
		for (char i : da) {
			System.out.print(Integer.toHexString(i)+"��");//��16������ʾ
			System.out.println(Integer.toBinaryString(i)+"��");
		}
	}

}
