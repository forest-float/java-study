package com.uitl.fileclass;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;



public class OutPutStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("d:" + File.separator + "text.txt");
		if(!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		//字节输出流需要使用到bytes类型，，需要将STring对象变为字节数组
		//OutputStream output = new FileOutputStream(file,true);
		//以追加的方式打开
		//会覆盖内容
		OutputStream output = new FileOutputStream(file);
		String str = "www.book.com";
		byte data[] = str.getBytes();//将字符串变为字节数组
		output.write(data);//输出内容
		output.write(data,3,3);//写入部分字节数组
		output.close();//关闭文件
	}

}
