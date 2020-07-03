package com.util.mathdemo;

//大整数操作类
import java.math.BigInteger;

public class BigInterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger bigA = new BigInteger("987656312786124");
		BigInteger bigB = new BigInteger("8768435135743521");
		System.out.println(bigA.add(bigB));//加
		System.out.println(bigA.subtract(bigB));//减
		System.out.println(bigA.multiply(bigB));//乘
		System.out.println(bigA.divide(bigB));//除
		BigInteger result[] = bigB.divideAndRemainder(bigA);//商和余数
		System.out.println(result[0] + "  " + result[1]);
	}

}
