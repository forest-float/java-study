package com.uitl.regular;

import java.util.Arrays;

public class RegexTest {
	public static void main(String[] args) {
		String str = "ashbdkaj\\[apo\"l;.-[]jhkl./,,";
		String regex = "[^a-z]";
		System.out.println(str.replaceAll(regex, "1"));
		
		String result[] = str.replaceAll(regex, "1").split("\\d+");
		System.out.println(Arrays.toString(result));
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		String string = "10.10";
		String regex2 = "\\d+(\\.\\d+)?";
		if(string.matches(regex2)) {
			System.out.println(Double.parseDouble(string));
		}
		
		
		
		
		
	}
}
