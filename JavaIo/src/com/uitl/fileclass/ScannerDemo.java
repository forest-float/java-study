package com.uitl.fileclass;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("please input:");
		while(scan.hasNext()) {
			System.out.println("input: " + scan.next());
		}		
		scan.close();
		
		Scanner scans = new Scanner(System.in);
		System.out.println("please input:");
		while(scans.hasNextDouble()) {//�ж��Ƿ�����Ϊdouble��������
			double socers = scans.nextDouble();//�������������ȡ����
			System.out.println("input: " + socers);
		}
		
		scans.close();
	}

}
