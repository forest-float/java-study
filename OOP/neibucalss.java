
public class neibucalss {
	private String msg = "hello world";
	private int foot = 0;
	class inner{
		private int data;
		public void print(){
			System.out.println("�ڲ���" + neibucalss.this.msg);//ͨ���ڲ������˽������		
		}
	}
	private inner root;
	public void fun(){
		inner in = new inner();
		System.out.println(this.root.data);
		in.print();
	}
	//neibuclass.inner in = new neibuclass.new inner();//�ڲ����ʵ��������
	private class inners{//private�������ڲ���ֻ��������ڲ�ʹ��
		public void print(){
			System.out.println("�ڲ���" + neibucalss.this.msg);
		}		
	}
	private static String msgs = "hello world";
	static class innerss{//static�������ڲ���ֻ�ܷ����ⲿ���static����
		public void print(){
			System.out.println("�ڲ���" + neibucalss.msgs);//��Ϊ��static���Σ��޷���עthis
		}
	}
	//neibuclass.innerss in = new neibuclass.inner();//static�������ڲ����ʵ����
}
