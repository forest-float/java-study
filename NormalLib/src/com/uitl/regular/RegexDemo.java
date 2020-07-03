package com.uitl.regular;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "enfmsnfwjhnvkl21314fdsadf1312zcvxz";
		String regex = "\\d+";
		
		Pattern pattern = Pattern.compile(regex);//编译正则
		
		String result[] = pattern.split(string);//拆分字符串
		System.out.println(Arrays.toString(result));
		
		
		Matcher mat = pattern.matcher(string);//进行正则匹配
		System.out.println(mat.matches());//匹配结果
		System.out.println(mat.getClass());
	}

}
