package com.uitl.fileclass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		//BufferedInputReader 字节缓冲区流
		// TODO Auto-generated method stub
		//字符缓冲区流
		//System.in 属于InputStream类型对象
		//字符缓冲区流   便于输入中文，且返回的是String类型
		BufferedReader buf = new BufferedReader
				(new InputStreamReader(System.in));
		String str = buf.readLine();//以回车作为换行
		System.out.println(str);
		
		boolean flag = true;
		while(flag) {
			String sd = buf.readLine();
			if(sd.matches("\\d{1,3}")) { 
				System.out.println(sd);
				flag = false;
			}else {
				System.err.println("age err");
			}
		}
		
		File file = new File("d:" + java.io.File.separator 
				+ "text.txt");
		@SuppressWarnings("resource")
		BufferedReader buf1 = new BufferedReader(new FileReader(file));
		String string = null;
		while((string = buf1.readLine()) != null) {
			System.out.println(string);
		}
	}

}
