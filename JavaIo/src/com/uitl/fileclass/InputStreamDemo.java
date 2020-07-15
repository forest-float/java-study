package com.uitl.fileclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("d:" + File.separator + "text.txt");
		if(!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		InputStream inputStream = new FileInputStream(file);
		byte data[] = new byte[1024];
		int len = inputStream.read(data);
		inputStream.close();
		System.out.println(new String(data));
		for (int i = 0; i < len; i++) {
			System.out.println(data[i]);
		}
	}

}
