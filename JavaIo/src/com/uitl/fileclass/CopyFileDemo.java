package com.uitl.fileclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		File file = new File("d:" + File.separator + "text.txt");
		if(!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		
		
		File filecopy = new File("d:" + File.separator + "textcopy.txt");
		
		InputStream input = new FileInputStream(file);
		OutputStream output = new FileOutputStream(filecopy);
		
		int temp = 0;
		byte[] data = new byte[1024];
		while ((temp = input.read(data)) != -1) {
			output.write(data,0,temp);				
		}
		input.close();
		output.close();
		long end = System.currentTimeMillis();
		System.out.println(end-start+"ms");	
	}

}
