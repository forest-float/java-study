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
		//�ֽ��������Ҫʹ�õ�bytes���ͣ�����Ҫ��STring�����Ϊ�ֽ�����
		//OutputStream output = new FileOutputStream(file,true);
		//��׷�ӵķ�ʽ��
		//�Ḳ������
		OutputStream output = new FileOutputStream(file);
		String str = "www.book.com";
		byte data[] = str.getBytes();//���ַ�����Ϊ�ֽ�����
		output.write(data);//�������
		output.write(data,3,3);//д�벿���ֽ�����
		output.close();//�ر��ļ�
	}

}
