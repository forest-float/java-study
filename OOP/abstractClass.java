
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
interface C{//���ֻ����ȫ�ֳ����ͳ��󷽷������䶨��Ϊ�ӿڣ��ӿ��ϸ���˵��һ���������
	public static final String MSG = "YOOTK";
	public abstract void print();
}
interface D{//���ֻ����ȫ�ֳ����ͳ��󷽷������䶨��Ϊ�ӿڣ��ӿ��ϸ���˵��һ���������
	public static final String MSG = "YOOTK";
	public abstract void get();
}
interface E{//�ӿڼ�  ֻ����public����Ȩ�ޣ�abstract
	String MSG = "YOOTK";
	void print();
}
class F implements C,D{//impelmentsʵ�ֶ���ӿ�
	public  void print(){
		
	}
	public void get(){
		
	}
}