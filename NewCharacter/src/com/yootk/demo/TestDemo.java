package com.yootk.demo;

enum Color {
	RED("��ɫ") {								// ��Ӧ�����ڲ���ķ�ʽʵ�ֽӿ�
		public String getTitle() {
			return this + " - red";
		}
	},
	GREEN("��ɫ") {							// ��Ӧ�����ڲ���ķ�ʽʵ�ֽӿ�
		public String getTitle() {
			return this + " - green";
		}
	},
	BLUE("��ɫ") {								// ��Ӧ�����ڲ���ķ�ʽʵ�ֽӿ�
		public String getTitle() {
			return this + " - blue";
		}
	};
	private String title; 						// ����
	private Color(String title) {					// ���췽��������ʹ��public����
		this.title = title;
	}
	public String toString() {					// ��дtoString()����
		return this.title;
	}
	public abstract String getTitle() ;			// ������󷽷�
}
public class TestDemo {
	public static void main(String[] args) { 
		System.out.println(Color.RED.getTitle());
	}
}

