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
		new Books().getInfo();//匿名对象   对象名字存放在栈内存中，对象内容放在堆内存中
		
		//简单JAVA类的使用
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
	//注意，属性用private封装之后，setter和getter是项目开发中的标准做法
	private String name;//属性进行私有化操作，对象无法直接进行使用
	private double price;
	public void setname(String n){//设置私有化属性的值
		name = n;
	}
	public String getname(){//获取私有化属性的值  
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

	public Books(){//构造方法 方法名称与类名称相同，没有返回值类型说明，构造方法可以重构
		name = "java study";
		price = 89.9;
	}
	public Books(String n, double p){
		name = n;
		price = p;
	}
}