package com.uitl.fileclass;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;



public class CodingDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		System.getProperties().list(System.out);
		File file = new java.io.File("d:" + java.io.File.separator + "text.txt");
		OutputStream out = new FileOutputStream(file,true);
		out.write("hello".getBytes("ISO8859-1"));//强行改变字符编码
	}
}
