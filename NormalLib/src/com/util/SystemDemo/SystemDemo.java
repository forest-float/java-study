package com.util.SystemDemo;

public class SystemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ĳ���������ѵ�ʱ��
		long start = System.currentTimeMillis();
		@SuppressWarnings("unused")
		String str = "";
		for (int i = 0; i < 1000; i++) {
			str += i;
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		System.gc();//�ֹ����������ռ�
	}
	//��ʾ������β��ʱ��ִ�е�һЩ��������дObject�෽��
	//Throwable��ʾ�����쳣���ߴ��󶼲��ᵼ�³����ж�
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("class is end");
		throw new Exception("��ʾ�����쳣���ߴ��󶼲��ᵼ�³����ж�");
	}

}
