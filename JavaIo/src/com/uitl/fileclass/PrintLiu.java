package com.uitl.fileclass;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;



public class PrintLiu {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//ʵ��������
		PrintStream pu = new PrintStream(new FileOutputStream("d:" 
				+ File.separator + "text.txt"));
		pu.print("��Һ�");
		pu.println();
		pu.print(1.1);
		pu.print(true);
		//��ʽ�����
		pu.printf("������%s,���䣺%d,�ɼ���%5.2f", "wlp",19,59.6688741);
		pu.close();
		
		//��ʽ���ַ���
		String str = String.format("������%s,���䣺%d,�ɼ���%5.2f", 
				"wlp",19,59.6688741);
		System.out.println(str);
		
		OutputStream out = System.out;//����outputStreamʵ����Ļ���
		out.write("hello".getBytes());
		
		InputStream input = System.in;
		byte data[] = new byte[1024];
		int len = input.read(data);
		System.out.println(new String(data,0,len));
		
		InputStream inputs = System.in;
		
		int temp = 0;
		StringBuffer buffer = new StringBuffer();
		while((temp = inputs.read()) != -1) {
			if(temp == '\n') {
				break;
			}
			buffer.append((char)temp);
		}
		System.out.println(buffer);
	}

}
