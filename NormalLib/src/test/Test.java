package test;

import java.text.SimpleDateFormat;
import java.util.Random;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//test1
		StringBuffer sBuffer  = new StringBuffer();
		for (char i = 'a'; i <= 'z'; i++) {
			sBuffer.append(i);
		}
		System.out.println(sBuffer);
		
		//test2
		Random rd = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.println(rd.nextInt(30));
		}
		
		String str = "mldnqa@163.net";
		String regex = "[a-zA-Z_][a-zA-Z_0-9\\.]*@[a-zA-Z_0-9\\.]+\\.(com|cn|net)";
		System.out.println(str.matches(regex));
		
		
		String str2 = "192.168.1.2";
		String regex2 = "([0-9]{1,3}\\.){3}[0-9]{1,3}";
		System.out.println(str2.matches(regex2));
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss.SSS");
		String date = "1981-09-19 09:07:27.727";
		java.util.Date dateget = sd.parse(date);
		System.out.println(dateget);
		System.out.println(sd.format(dateget));
	}	
}
