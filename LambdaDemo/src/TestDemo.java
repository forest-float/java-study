
interface IMessage{
	public void print();
}

public class TestDemo {

	public static void main(String[] args) {
		fun(()->System.out.println("lambda"));
	}
	public static void fun(IMessage msg){
		msg.print();
	}
}
