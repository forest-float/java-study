/*
* @Author: wlp
* @Date:   2020-06-03 11:43:48
* @Last Modified by:   forest-float
* @Last Modified time: 2020-06-03 14:36:18
*/
public class DataType{
	public static void main(String args[]){
		System.out.println("hello !");
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		System.out.println(max+1);//���ֵ�ټ�һ�����Ǳ����Сֵ�������������-2147483648
		System.out.println(max+1L);//����1L���൱�ڽ�int������ת���long�������� 2147483647
		long num = 1000L;
		int intnum = (int)num;//long����ת����int����
		System.out.println(intnum);
		byte x = 127;//byte���͵����ݷ�Χ�� -128~~127
		System.out.println(x);
		
		float f1 = 10.2F;//С������double���ͣ�ʹ��Ҫת����float����
		float f2 = (float)10.2;
		System.out.println(f1*f2);//float * float = float
		
		String str = "hello";
		str = str + "world";//String ���� �ַ���  �ַ���ƴ��
		System.out.println(str);
		
		int a = 10;
		int b = 20;
		int maxs = a > b ? a : b;//��Ŀ����
		System.out.println(maxs);
		
		boolean flag = true;
		System.out.println(!flag);//�߼�����
		
		if((1 == 2) && (10 / 0 == 0)){
			System.out.println("ok");
		}
		else{
			System.out.println("false");
		}
		/* & ȫ1Ϊ1������Ϊ0     | ��1Ϊ1      ^ ͬΪ0����Ϊ1    ~ ��λȡ��*/
		//��JDK1.7��ʼ switch֧���ַ��������ж�
		//if�������жϲ������ʽ��switchֻ���ж�����
		//while���ж�ѭ���������ٽ���ѭ��
		//do...whileѭ�����Ƚ���ѭ��һ���ڽ����ж�����
		
		//continue ��break
		for(int i = 0; i < 10; i ++){
			if(i == 3){
				continue;//֮��Ĵ��벻ִ�У�ֱ�ӽ�������ѭ��
			}
			System.out.println("i = " + i + "��");//��+����ƴ��
		}
		
		printInfo();
		System.out.println(add(1 , 2));
		System.out.println(add(1.0 , 2.0));
		System.out.println(1+2.0);
	}
	
	public static void printInfo(){//���û�д��ξ�ֱ���ǿ����ţ���Ҫд����
		System.out.println("ok");
		System.out.println("ok");
		System.out.println("ok");
		System.out.println("ok");
	}
	public static int add(int a, int b){//��������    ���������ͻ������ͬ
		return a + b;
	}
	public static double add(double a, double b){//��������
		return a + b;
	}
}