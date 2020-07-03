package com.util.mathdemo;

//大小写操作类
import java.math.BigDecimal;

public class BigDecimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(round(123.456, 2));
	}
	//完成准确位的四舍五入
	public static double round(double num, int scale) {
		BigDecimal big = new BigDecimal(num);//传递一个double类型数据
		BigDecimal result = big.divide(new BigDecimal(1),//被除数
				scale,//保留的小数位长度
				BigDecimal.ROUND_HALF_UP);//进位模式  向上进位
		return result.doubleValue();//Number类的方法
	}
}
