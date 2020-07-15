package com.uitl.fileclass;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TransportDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("d:" + File.separator +  "text.txt");
		
		if(!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		OutputStream output = new FileOutputStream(file, true);//�ֽ���
		Writer out = new OutputStreamWriter(output);//ת�������ַ���
		String str = "www.hello.com";
		out.write(str);
		out.flush();
		out.close();
	}

}
