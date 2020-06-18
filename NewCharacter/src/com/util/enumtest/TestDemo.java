package com.util.enumtest;

enum Color{//����ö����
	RED,GREEN,BLUE;//��ʾ�˴�Ϊʵ��������
}

enum ColorMore{
	RED("red"),GREEN("green"),BLUE("blue");//����ö�ٶ��󣬱���д������
	private String titleString;
	private ColorMore(String titleString) {
		this.titleString = titleString;
	}
	public String toString(){
		return this.titleString;
	}
	
}
//ö�����ڼ򻯵Ķ������ģʽ
public class TestDemo {
	public static void main(String[] args) {
		Color red = Color.RED;//ֱ��ȥ��ö�ٶ���
		System.out.println(red);//���Ĭ�������Ƕ��������   RED
		Colors green = Colors.getInstance(2);
		System.out.println(green);//��ɫ
		
		for(Color color : Color.values())
		{
			System.out.println(color);
		}
		
		for(ColorMore color : ColorMore.values())
		{
			System.out.println(color);
		}
	}

}
//�������ģʽ
class Colors{
	private String title;
	//final������಻��������
	//final����ķ������ܱ���������д
	//ʹ��final����ı�������˳������ڶ����ʱ�����ú����ݣ����Ҳ����޸�
	private static final Colors RED = new Colors("��ɫ");
	private static final Colors GREEN = new Colors("��ɫ");
	private static final Colors BLUE = new Colors("��ɫ");
	
	private Colors(String title) {//���캯��
		super();
		this.title = title;
	}
	
	public static Colors getInstance(int ch){
		switch (ch) {
		case 1:
			return RED;
		case 2:
			return GREEN;
		case 3:
			return BLUE;
		default:
			return null;
		}
	}
	public String toString(){
		return this.title;
	}
}
