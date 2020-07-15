package com.uitl.fileclass;

import java.io.File;
import java.math.BigDecimal;
import java.util.Date;

public class BasicDemo {
	public static void main(String[] args) throws Exception {
		//��Ŀ¼�´����ļ�
		File file = new java.io.File("d:\\test.txt");
		//��\\����ת���ַ���'\'����ʾ·���ָ���   
		//��windows��·���ָ�����'\',��Linux��·���ָ����ǡ�/��
		//���Ϊ��ƽ̨���ݵ�һ���ԣ���ʹ��·���ָ�������  File.separator
		System.out.println(file);
		System.out.println(file.exists());
		if(file.exists()) {
			file.delete();
			System.out.println("���ڣ�ɾ��");
		}else {
			System.out.println(file.createNewFile());
		}
		//������Ŀ¼���ļ�
		File files = new java.io.File("d:"+ File.separator +"test"+ File.separator +"test.txt");
		if(!files.getParentFile().exists()) {//�жϸ�·���Ƿ����
			files.getParentFile().mkdirs();//������·��
		}
		files.delete();
		System.out.println(files.createNewFile());//�����µģ���Ŀ¼�����Ž�
		//��ȡ�ļ��Ĵ�С
		System.out.println(new BigDecimal((double)files.length()/1024/1024)
				.divide(new BigDecimal(1),2,BigDecimal.ROUND_HALF_UP));
		System.out.println(new Date(files.lastModified()));
		files.delete();
		//�г�·���µ�Ŀ¼��Ϣ
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
					System.out.println(dir.getParentFile());//�ļ�Ŀ¼
					System.out.println(dir.getName());//�ļ�����
					
				}
			}
			
		}
		
	}
}
