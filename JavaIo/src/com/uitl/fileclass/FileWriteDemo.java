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
		//字符流需要将数据经过缓存区处理才能与终端数据文件数据交互
		//强制刷新缓存区
		out.flush();
	}

}
