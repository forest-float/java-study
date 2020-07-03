package com.util.RuntimeDemo;

public class RuntimeDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		String str = "";
		for (int i = 0; i < 1000; i++) {
			str += i;
		}
		Runtime run = Runtime.getRuntime();//ȡ�����ʵ��������
		System.out.println(run.maxMemory());//ȡ���������ڴ�
		System.out.println(run.totalMemory());//ȡ��ȫ�������ڴ�
		System.out.println(run.freeMemory());//ȡ�ÿ����ڴ�
		
		run.gc();//�ͷ������ռ�
		System.out.println(run.maxMemory());//ȡ���������ڴ�
		System.out.println(run.totalMemory());//ȡ��ȫ�������ڴ�
		System.out.println(run.freeMemory());//ȡ�ÿ����ڴ�
		
		
		Process pro = run.exec("mspaint.exe");//���ÿ�ִ�г���
		Thread.sleep(20000);//����������Զ��ر�
		pro.destroy();//���ٽ���
	}

}
