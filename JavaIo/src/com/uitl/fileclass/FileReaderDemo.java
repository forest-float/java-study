package com.uitl.fileclass;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("d:" + File.separator + "text.txt");
		if(!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		
		Reader input = new FileReader(file);
		char data[] = new char[1024];
		int len = input.read(data);
		input.close();
		System.out.println(new String(data,0,len));
	}

}
