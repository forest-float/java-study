package com.util.datedemo;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();//��ȡ�������
		StringBuffer str = new StringBuffer();
		System.out.println(calendar.get(Calendar.DATE));//����get������ȡ��Ҫ������
		str.append(calendar.get(Calendar.YEAR)).append("-");
		str.append(calendar.get(Calendar.MONTH)+1).append("-");
		str.append(calendar.get(Calendar.DATE)).append(" ");
		str.append(calendar.get(Calendar.HOUR_OF_DAY)).append(":");
		str.append(calendar.get(Calendar.MINUTE)).append(":");
		str.append(calendar.get(Calendar.SECOND)).append(" ");
		str.append(calendar.get(Calendar.WEEK_OF_MONTH)).append(" ");
		System.out.println(str);
	}

}
