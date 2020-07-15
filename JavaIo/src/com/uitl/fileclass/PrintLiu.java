package com.uitl.fileclass;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;



public class PrintLiu {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//实例化对象
		PrintStream pu = new PrintStream(new FileOutputStream("d:" 
				+ File.separator + "text.txt"));
		pu.print("大家好");
		pu.println();
		pu.print(1.1);
		pu.print(true);
		//格式化输出
		pu.printf("姓名：%s,年龄：%d,成绩：%5.2f", "wlp",19,59.6688741);
		pu.close();
		
		//格式化字符串
		String str = String.format("姓名：%s,年龄：%d,成绩：%5.2f", 
				"wlp",19,59.6688741);
		System.out.println(str);
		
		OutputStream out = System.out;//利用outputStream实现屏幕输出
		out.write("hello".getBytes());
		
		InputStream input = System.in;
		byte data[] = new byte[1024];
		int len = input.read(data);
		System.out.println(new String(data,0,len));
		
		InputStream inputs = System.in;
		
		int temp = 0;
		StringBuffer buffer = new StringBuffer();
		while((temp = inputs.read()) != -1) {
			if(temp == '\n') {
				break;
			}
			buffer.append((char)temp);
		}
		System.out.println(buffer);
	}

}
