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
		while(scans.hasNextDouble()) {//判断是否输入为double类型数据
			double socers = scans.nextDouble();//将输入的数据提取出来
			System.out.println("input: " + socers);
		}
		
		scans.close();
	}

}
