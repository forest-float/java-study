package com.uitl.fileclass;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Neicunliu {

	//CharArrayReader�ڴ��ַ�������  CharArrayWriter�ڴ��ַ������
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//�ڴ���  ����IO���������ڴ��̲����ļ���ֱ�ӽ��ڴ浱����ʱ�ĵ�
		//ͨ���ڴ���ʵ�����ݵ�ת�����ֽ����ݱ������ڴ������棬�ڴ���ȡ��ÿ������
		//������Ҫ��ȡ���������õ��ڴ���������
		String string = "www.hello.com";
		InputStream inputStream = new //�ڴ��ֽ�������
				ByteArrayInputStream(string.getBytes());
		OutputStream outputStream = new ByteArrayOutputStream();
		//�ڴ��ֽ������
		int temp = 0;
		while((temp = inputStream.read()) != -1) {
			outputStream.write(Character.toUpperCase(temp));
		}
		System.out.println(outputStream);
		inputStream.close();
		outputStream.close();
	}

}
