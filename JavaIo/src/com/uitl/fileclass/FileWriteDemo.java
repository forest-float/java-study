package com.uitl.fileclass;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class FileWriteDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("d:" + File.separator +  "text.txt");
		
		if(!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		Writer out = new FileWriter(file, true);
		String str = "www.csdn.com";
		out.write(str);
		System.out.println(str);
		out.close();
		//�ַ�����Ҫ�����ݾ�������������������ն������ļ����ݽ���
		//ǿ��ˢ�»�����
		out.flush();
	}

}
