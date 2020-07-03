package com.uitl.fanshe;

@FunctionalInterface
interface fruit{
	public void eat();
}

class Apple implements fruit{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat apple!");
	}	
	
}
class Orange implements fruit{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat orange!");
	}	
	
}
class Factory{
	public static fruit getInstance(String className) {
		fruit f = null;
		try {//����ʵ����������������ʹ��Fruit����
			f = (fruit)Class.forName(className).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}
}

public class TestFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fruit fa = Factory.getInstance("com.uitl.fanshe.Apple");
		fruit fb = Factory.getInstance("com.uitl.fanshe.Orange");
		fa.eat();
		fb.eat();
	}

}
