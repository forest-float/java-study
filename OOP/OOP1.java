/*
* @Author: wlp
* @Date:   2020-06-04 09:47:09
* @Last Modified by:   forest-float
* @Last Modified time: 2020-06-04 14:41:11
*/
class Book{
	String name;
	double price;
	public void getInfo(){
		System.out.println("name: " + name + " title: " + price);
	}
	public boolean compare(Book book) {
		// TODO Auto-generated method stub
		if(book == null){
			return false;
		}
		if(this == book){
			return true;
		}
		if(this.name.equals(book.name)  && this.price == book.price){
			return true;
		}else{
			return false;
		}		
	}
}
public class OOP1{
	public static void main(String args[]){
		Book bk = new Book();
		bk.name = "java";
		bk.price = 89.9;
		bk.getInfo();
		Books bks = new Books();
		//bks.setname("java");conver
		//bks.setprice(89.9);
		bks.getInfo();
		new Books().getInfo();//��������   �������ִ����ջ�ڴ��У��������ݷ��ڶ��ڴ���
		
		//��JAVA���ʹ��
		SampleClass eClass = new SampleClass(7396, "SMIYH", "CLERK", 800.0, 1.0);
		System.out.println(eClass.getInfo());
		
		new array();		
		
		int arra[] = {1,4,7,9,2,5,8,6,0};
		array n = new array();
		n.sortarray(arra);
		for(int i = 0; i < arra.length; i++){
			System.out.println(arra[i]);
		}
		
		new listandjava();
	}
}
class Books{
	//ע�⣬������private��װ֮��setter��getter����Ŀ�����еı�׼����
	private String name;//���Խ���˽�л������������޷�ֱ�ӽ���ʹ��
	private double price;
	public void setname(String n){//����˽�л����Ե�ֵ
		name = n;
	}
	public String getname(){//��ȡ˽�л����Ե�ֵ  
		return name;
	}
	public void setprice(double p){
		price = p;
	}
	public double getprice(){
		return price;
	}
	public void getInfo(){
		System.out.println("name: " + name + " title: " + price);
	}

	public Books(){//���췽�� ������������������ͬ��û�з���ֵ����˵�������췽�������ع�
		name = "java study";
		price = 89.9;
	}
	public Books(String n, double p){
		name = n;
		price = p;
	}
}