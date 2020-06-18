package com.yootk.demo;

enum Color {
	RED("红色") {								// 适应匿名内部类的方式实现接口
		public String getTitle() {
			return this + " - red";
		}
	},
	GREEN("绿色") {							// 适应匿名内部类的方式实现接口
		public String getTitle() {
			return this + " - green";
		}
	},
	BLUE("蓝色") {								// 适应匿名内部类的方式实现接口
		public String getTitle() {
			return this + " - blue";
		}
	};
	private String title; 						// 属性
	private Color(String title) {					// 构造方法，不能使用public声明
		this.title = title;
	}
	public String toString() {					// 覆写toString()方法
		return this.title;
	}
	public abstract String getTitle() ;			// 定义抽象方法
}
public class TestDemo {
	public static void main(String[] args) { 
		System.out.println(Color.RED.getTitle());
	}
}

