package com.util.mathdemo;

//������������
import java.math.BigInteger;

public class BigInterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger bigA = new BigInteger("987656312786124");
		BigInteger bigB = new BigInteger("8768435135743521");
		System.out.println(bigA.add(bigB));//��
		System.out.println(bigA.subtract(bigB));//��
		System.out.println(bigA.multiply(bigB));//��
		System.out.println(bigA.divide(bigB));//��
		BigInteger result[] = bigB.divideAndRemainder(bigA);//�̺�����
		System.out.println(result[0] + "  " + result[1]);
	}

}
