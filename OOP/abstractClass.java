
public class abstractClass {
	public static void main(String args[]) {
		new B(30);
	}
}
abstract class A{
	public A() {
		this.print();
	}
	public abstract void print();
}
class B extends A{
	private int num = 100;
	public B(int num){
		this.num = num;
		this.print();
	}
	public void print(){
		System.out.println(this.num);
	}
}
interface C{//如果只含有全局常量和抽象方法，将其定义为接口，接口严格来说是一个特殊的类
	public static final String MSG = "YOOTK";
	public abstract void print();
}
interface D{//如果只含有全局常量和抽象方法，将其定义为接口，接口严格来说是一个特殊的类
	public static final String MSG = "YOOTK";
	public abstract void get();
}
interface E{//接口简化  只能是public访问权限，abstract
	String MSG = "YOOTK";
	void print();
}
class F implements C,D{//impelments实现多个接口
	public  void print(){
		
	}
	public void get(){
		
	}
}