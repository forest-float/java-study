
public class String_Char {
	public void f1(String str){
		char c = str.charAt(0);//��ȡ��һ���ַ�
		System.out.println(c);
	}
	public void f2(String str){
		char [] data  = str.toCharArray();//���ַ�������ַ�����
		for(int i = 0; i < data.length; i++){
			System.out.println(data[i]);
		}
	}
	public void f3(char[] data){
		String str = new String(data);//���ַ�����ת���ӳ��ַ���		
		System.out.println(str);		
	}
	public void f4(String str){
		String data = str.toLowerCase();//תСд
		System.out.println(data);	
	}
	public void f5(String str){
		String data = str.toUpperCase();//ת��д
		System.out.println(data);	
	}
	public void f6(String str){
		//String data = str.toUpperCase();//ת��д
		System.out.println(str.length());	//����
	}
	public void f7(String str){
		//String data = str.toUpperCase();//ת��д
		System.out.println(str.isEmpty());	//�Ƿ�Ϊ��
	}
	public void f8(String str){
		//String data = str.toUpperCase();//ת��д
		System.out.println(str.isEmpty());	//�Ƿ�Ϊ��
	}
	public void f9(String str){
		//String data = str.toUpperCase();//ת��д
		System.out.println(str.startsWith("h"));	//�Ƿ��ԡ�h����ͷ
	}
	public void f10(String str){
		//String data = str.toUpperCase();//ת��д
		System.out.println(str.endsWith("h"));	//�Ƿ��ԡ�h����β
	}
	public void f11(String str){
		//String data = str.toUpperCase();//ת��д
		String [] data = str.split(",");//��str��","���в��
		for(int i =0; i < data.length; i++){
			System.out.println(data[i]);	
		}		
	}
	public void f12(char [] data, int offset, int count){
		String str = new String(data, offset, count);//�������ַ�����ת�����ַ���
		System.out.println(str);
	}
	public void f13(String str){//char:0~255    byte:-128~127
		byte[] data = str.getBytes();//���ַ�����Ϊ�ֽ�����
		for(int i = 0; i < data.length; i++){
			System.out.println(data[i]);
		}		
	}
	public void f14(String str){
		String data = "hello";
		System.out.println(str.compareTo(data));//�ж������ַ����Ĵ�С
	}
	public void f15(String str){
		System.out.println(str.contains("hello"));//�ж�ָ�������Ƿ����
		System.out.println(str.indexOf("hello"));//��ǰ�������ָ���ַ�����λ�ã��ҵ�����λ������
		System.out.println(str.startsWith("hello"));//�Ƿ���ָ���ַ�����ʼ
		System.out.println(str.endsWith("hello"));//�Ƿ���ָ���ַ�����β
	}
	public void f16(String str){
		String stra = str.replaceAll("l", "_");//�ַ������滻   �滻ȫ��
		String strb = str.replaceFirst("l", "_");//�ַ������滻 ��ֻ�滻��һ��
		System.out.println(stra);
		System.out.println(strb);
	}
	public void f17(String str){
		String data = str.substring(2);//�ַ����Ľ�ȡ  ����������β
		String datas = str.substring(0, 5);//�ַ����Ľ�ȡ  ֻ��ȡ�����ַ���
		System.out.println(data);
		System.out.println(datas);
	}
	public void f18(String str){
		String [] data = str.split("/");//����/�����в��  ����ǿ��ַ�������һ��һ���ַ����
		for(int i = 0; i < data.length; i ++){
			System.out.println(data);
		}
		String [] datas = str.split("/",3);//ָ����ֵĸ���
		for(int i = 0; i < datas.length; i ++){
			System.out.println(datas);
		}
		
		//Ҫ����������ʽ��Ӱ�죬  ������.�ǲ�������ִ�еģ�����Ҫ��Ҫ��ֵ�.����ת�壬��java��ת���á�\\��
		String numString = "192.168.1.2";
		String [] num1 = numString.split(".");
		for(int i = 0; i < num1.length; i ++){
			System.out.print(num1[i] + "��");
		}
		String [] num2 = numString.split("\\.");
		for(int i = 0; i < num2.length; i ++){
			System.out.print(num2[i] + "��");
		}
		
	}
	
}
