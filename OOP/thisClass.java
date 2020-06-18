
public class thisClass {
	
	//this关键字的三种用法    调用本类属性  调用本类方法    表示当前对象
	private String title;
	private double price;
	public thisClass(String title, double price){
		this();//调用本类的无参构造方法， 使用时只能在构造方法的首行
		
		//title = title;
		//price = price;错误方法
		
		//要访问类的属性  ，一定要加上this.
		this.title = title;
		this.price = price;
		this.getInfo();//调用本类的方法
	}
	public thisClass(){
		System.out.println("创建一个新的对象");
	}
	public String  getInfo(){
		return "书名：" + title + " 价格：" + price;
	}

}
