package com.util.mathdemo;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.print(rand.nextInt(100) + "¡¢ ");
		}
		int data[] = new int[7];
		Random rd = new Random();
		int i = 0;
		while(i < 7) {
			int d = rd.nextInt(37);
			if(isrepeat(data, d)) {
				data[i++] = d;
			}
		}
		java.util.Arrays.sort(data);
		for (int j = 0; j < data.length; j++) {
			System.out.println(data[j]);
		}
		System.out.println(Double.MAX_VALUE * Double.MAX_VALUE);
	}
	public static boolean isrepeat(int data[], int d) {
		if(data == null) {
			return true;
		}
		for (int i = 0; i < data.length; i++) {
			if(i == d) {
				return false;
			}
		}
		return true;
	}

}
