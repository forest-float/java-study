package com.util.comparedemo;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = new int[] {1, 3, 5, 7, 9, 2, 6, 4, 8, 10};
		Arrays.sort(data);//����
		for(int i : data) {
			System.out.print(i + "��");
		}
		System.out.println(Arrays.binarySearch(data, 8));//���ֲ���
		
		int data2[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.equals(data, data2));//������ȱȽ�
		
		char data3[] = new char[10];
		Arrays.fill(data3, 'a');//��������
		String data4 = Arrays.toString(data3);//�������Ϊ�ַ������
		System.out.println(data4);
		
		StringBuffer stringBuffer = new StringBuffer("abcdefg");
		stringBuffer.append("hello");
		System.out.println(stringBuffer);
		
	}

}
