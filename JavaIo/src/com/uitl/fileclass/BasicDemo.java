package com.uitl.fileclass;

import java.io.File;
import java.math.BigDecimal;
import java.util.Date;

public class BasicDemo {
	public static void main(String[] args) throws Exception {
		//根目录下创建文件
		File file = new java.io.File("d:\\test.txt");
		//“\\”的转义字符是'\'，表示路径分隔符   
		//在windows中路径分隔符是'\',在Linux中路径分隔符是‘/’
		//因此为了平台兼容的一致性，会使用路径分隔符常量  File.separator
		System.out.println(file);
		System.out.println(file.exists());
		if(file.exists()) {
			file.delete();
			System.out.println("存在，删除");
		}else {
			System.out.println(file.createNewFile());
		}
		//创建带目录的文件
		File files = new java.io.File("d:"+ File.separator +"test"+ File.separator +"test.txt");
		if(!files.getParentFile().exists()) {//判断父路径是否存在
			files.getParentFile().mkdirs();//创建父路径
		}
		files.delete();
		System.out.println(files.createNewFile());//创建新的，带目录的新闻进
		//获取文件的大小
		System.out.println(new BigDecimal((double)files.length()/1024/1024)
				.divide(new BigDecimal(1),2,BigDecimal.ROUND_HALF_UP));
		System.out.println(new Date(files.lastModified()));
		files.delete();
		//列出路径下的目录信息
		File dir = new File("d:" + File.separator);
		if(dir.isDirectory()) {
			File result[] = dir.listFiles();
			for (int i = 0; i < result.length; i++) {
				System.out.println(result[i]);
			}
		}
		
		Print(dir);
	}
	public static void Print(File dir) {
		if(dir.isDirectory()) {
			File result[] = dir.listFiles();
			if(result != null) {
				for (int i = 0; i < result.length; i++) {
					Print(result[i]);
				}
				if(result.length == 1) {
					System.out.println(dir);
					System.out.println(dir.getParentFile());//文件目录
					System.out.println(dir.getName());//文件名字
					
				}
			}
			
		}
		
	}
}
