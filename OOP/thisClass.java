
public class thisClass {
	
	//this�ؼ��ֵ������÷�    ���ñ�������  ���ñ��෽��    ��ʾ��ǰ����
	private String title;
	private double price;
	public thisClass(String title, double price){
		this();//���ñ�����޲ι��췽���� ʹ��ʱֻ���ڹ��췽��������
		
		//title = title;
		//price = price;���󷽷�
		
		//Ҫ�����������  ��һ��Ҫ����this.
		this.title = title;
		this.price = price;
		this.getInfo();//���ñ���ķ���
	}
	public thisClass(){
		System.out.println("����һ���µĶ���");
	}
	public String  getInfo(){
		return "������" + title + " �۸�" + price;
	}

}
