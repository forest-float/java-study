
public class neibucalss {
	private String msg = "hello world";
	private int foot = 0;
	class inner{
		private int data;
		public void print(){
			System.out.println("内部类" + neibucalss.this.msg);//通过内部类访问私有属性		
		}
	}
	private inner root;
	public void fun(){
		inner in = new inner();
		System.out.println(this.root.data);
		in.print();
	}
	//neibuclass.inner in = new neibuclass.new inner();//内部类的实例化对象
	private class inners{//private声明的内部类只能在类的内部使用
		public void print(){
			System.out.println("内部类" + neibucalss.this.msg);
		}		
	}
	private static String msgs = "hello world";
	static class innerss{//static声明的内部类只能访问外部类的static操作
		public void print(){
			System.out.println("内部类" + neibucalss.msgs);//因为是static修饰，无法标注this
		}
	}
	//neibuclass.innerss in = new neibuclass.inner();//static声明的内部类的实例化
}
