package com.uitl.regular;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "enfmsnfwjhnvkl21314fdsadf1312zcvxz";
		String regex = "\\d+";
		
		Pattern pattern = Pattern.compile(regex);//��������
		
		String result[] = pattern.split(string);//����ַ���
		System.out.println(Arrays.toString(result));
		
		
		Matcher mat = pattern.matcher(string);//��������ƥ��
		System.out.println(mat.matches());//ƥ����
		System.out.println(mat.getClass());
	}

}
