package com.util.enumtest;

enum Color{//定义枚举类
	RED,GREEN,BLUE;//表示此处为实例化对象
}

enum ColorMore{
	RED("red"),GREEN("green"),BLUE("blue");//定义枚举对象，必须写在首行
	private String titleString;
	private ColorMore(String titleString) {
		this.titleString = titleString;
	}
	public String toString(){
		return this.titleString;
	}
	
}
//枚举属于简化的多例设计模式
public class TestDemo {
	public static void main(String[] args) {
		Color red = Color.RED;//直接去的枚举对象
		System.out.println(red);//输出默认内容是对象的名称   RED
		Colors green = Colors.getInstance(2);
		System.out.println(green);//绿色
		
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
//多例设计模式
class Colors{
	private String title;
	//final定义的类不在有子类
	//final定义的方法不能被子类所覆写
	//使用final定义的变量变成了常量，在定义的时候设置好内容，并且不能修改
	private static final Colors RED = new Colors("红色");
	private static final Colors GREEN = new Colors("绿色");
	private static final Colors BLUE = new Colors("蓝色");
	
	private Colors(String title) {//构造函数
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
