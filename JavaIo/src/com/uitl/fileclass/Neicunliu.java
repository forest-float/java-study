package com.uitl.fileclass;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Neicunliu {

	//CharArrayReader内存字符输入流  CharArrayWriter内存字符输出流
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//内存流  进行IO操作，不在磁盘产生文件，直接将内存当做临时文档
		//通过内存流实现数据的转换，现将数据保存在内存流里面，在从中取出每个数据
		//将所有要读取的数据设置到内存输入流中
		String string = "www.hello.com";
		InputStream inputStream = new //内存字节输入流
				ByteArrayInputStream(string.getBytes());
		OutputStream outputStream = new ByteArrayOutputStream();
		//内存字节输出流
		int temp = 0;
		while((temp = inputStream.read()) != -1) {
			outputStream.write(Character.toUpperCase(temp));
		}
		System.out.println(outputStream);
		inputStream.close();
		outputStream.close();
	}

}
