package com.util.newJava;

public class TestDemo {
	public static void main(String[] args) {
		System.out.println(add(new int[]{1,2,3,4,5,6}));
		System.out.println(adds(new int[]{1,2,3,4}));
		
		
		//��ʹ��ʹ�÷������ͣ�Ҳ����ִ��󣬵�ִ�е�ʱ��������ʹ��󣬲Ż����
		//Ϊ�˱�֤��Ƶĺ����ԣ���������÷������ͣ���ʹ��Object����
		Fanxing<String> pFanxing = new Fanxing<String>();
		pFanxing.setxT("����100��");
		pFanxing.setyT("��γ20��");
		
		String x = pFanxing.getxT();
		String y = pFanxing.getyT();
		System.out.println(x + ": " + y);
		
		//�����˴���ȥ�����ͣ��������ʧ�ܣ�ֱ�ӱ���ʧ��
		Fanxing<Integer> pFanxings = new Fanxing<Integer>();
		pFanxings.setxT(10);
		pFanxings.setyT(10);
		
		int xs = pFanxings.getxT();
		int ys = pFanxings.getyT();
		System.out.println(xs + ": " + ys);
	}
	//ʹ��ͨ�������������������������⣬��ֹ�������͵Ĳ������ݳ��ִ���
	//public static void fun(Fanxing<String> temp){
	//public static void fun(Fanxing<Integer> temp){
	//ʹ��ͨ������������ڿ��Խ�������󣬵��ǲ����޸Ķ�������
	//public static void fun(Fanxing temp){
	//�����ָ�ɷ������ͣ���Ĭ��ΪObject���ͣ���������������޸���������
	public static void fun(Fanxing<?> temp){
		System.out.println(temp.getxT());
	}
	
	public static int add(int ... data){//�ɱ������ʵ�ʴ��ݶ�����������յ�����
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum;
	}
	
	public static int adds(int ... data){
		int sum = 0;
		for (int i : data) {//foreachѭ��   forѭ���ļ�ǿ��
			sum += i;
		}
		return sum;
	}

	//���÷�������   ֻ����Number����Number����
	//class Message<T extends Number>
	//public static void fun(Message<? extends Number> temp)
	
	//������������ ֻ����String����Object����
	//public static void fun(<? super String> temp)
	
	
}
