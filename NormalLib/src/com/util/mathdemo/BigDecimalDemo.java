package com.util.mathdemo;

//��Сд������
import java.math.BigDecimal;

public class BigDecimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(round(123.456, 2));
	}
	//���׼ȷλ����������
	public static double round(double num, int scale) {
		BigDecimal big = new BigDecimal(num);//����һ��double��������
		BigDecimal result = big.divide(new BigDecimal(1),//������
				scale,//������С��λ����
				BigDecimal.ROUND_HALF_UP);//��λģʽ  ���Ͻ�λ
		return result.doubleValue();//Number��ķ���
	}
}
