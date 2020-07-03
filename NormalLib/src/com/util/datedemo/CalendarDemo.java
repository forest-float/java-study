package com.util.datedemo;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();//获取本类对象
		StringBuffer str = new StringBuffer();
		System.out.println(calendar.get(Calendar.DATE));//调用get函数获取想要的数据
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
