package com.yootk.demo;

public class TestDemo {
	public static void main(String args[]){
		int num = 10;
		assert num == 20:"������10";
		
		System.out.println("1. �������㿪ʼ��");
		try {
			System.out.println("2. �������㣺" + (10 / 0));		// �˴������쳣
			// �쳣����֮�����佫����ִ�У��˴���try�в����쳣������������������ִ�� 
			System.out.println("����γ�����ʣ�www.yootk.com");
		} catch (ArithmeticException e) {						// ���������쳣
			System.out.println("******** �����쳣�� *********");
			e.printStackTrace();
		} catch (Exception e) {//��ȡȫ���쳣
			// TODO: handle exception
			e.printStackTrace();
		} finally{
			System.out.println("2. �������㣺" );
		}
		System.out.println("3. �������������");
		
		try{
			System.out.println(div(1, 0));
			throw new Exception("�Լ�������쳣");
		}catch(Exception e){
			System.out.println("******** �����쳣�� *********");
		}
		
	}
	
	//throws�ؼ�����Ҫ�ڷ������������ã���ʾ�˷����������쳣�����������ô�����
	public static int div(int x, int y) throws Exception{
		return  x / y;
	}

	//RuntimeException�ڱ���ʱ����ǿ��Ҫ������쳣�Ĵ����û����Ը��ݽ��Լ���������ѡ���ԵĽ��д���
}
