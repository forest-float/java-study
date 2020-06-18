import java.util.StringTokenizer;


interface Message{
	public void print();
}
class MessageImpl implements Message{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("传递接口的子类实例化对象");
	}	
}
public class TestDemo {
	public static void main(String args[]){
		PetShop shop = new PetShop();
		//接收接口对象，可以传递子类实例化对象
		shop.add(new Cat("波斯猫",1)) ;		// 增加宠物
		shop.add(new Cat("暹罗猫",2)) ;		// 增加宠物
		shop.add(new Cat("波米拉猫",1)) ;		// 增加宠物
		shop.add(new Dog("松狮",1)) ;			// 增加宠物
		shop.add(new Dog("波尔多",2)) ;		// 增加宠物
		shop.delete(new Cat("波米拉猫",9)) ;	// 删除宠物信息
		LinkList all = shop.search("波");
		Object [] dataObjects = all.toArray();
		for (int i = 0; i < dataObjects.length; i++) {
			System.out.println(dataObjects[i]);
		}
		fun(new MessageImpl());//传递子类实例化对象
		fun(new Message() {//在传参里面定义匿名内部类
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类");
			}
		});
	}
	public static void fun(Message msg){
		msg.print();
		
	}
	@SuppressWarnings("unused")
	public static void datatype(){//基本数据类型的包装类
		Integer i = new Integer(10);	//将基本数据类型装箱	
		Byte b = new Byte((byte) 0);
		Short s = new Short((short) 1);
		Character character = new Character('c');
		Long long1 = new Long(1L);
		Float float1 = new Float(10.0);
		Double double1 = new Double(1.0);
		Boolean boolean1 = new Boolean(false);
		
		int iint = i.intValue();//将基本数据类型拆箱
		byte bs = b.byteValue();
		short ss = s.shortValue();
		char c = character.charValue();
		long l = long1.longValue();
		float f = float1.floatValue();
		double d = double1.doubleValue();
		boolean bss = boolean1.booleanValue();
		
		Boolean bsBoolean = true;//自动装箱
		boolean bssss = bsBoolean;//自动拆箱
	}
	@SuppressWarnings("unused")
	public static void StringTokenizer(){//数据类型的转换
		String string  = "123";
		int temp = Integer.parseInt(string);//string里面不能出现非数字的字符
		
		String string2 = "1.2";
		double d = Double.parseDouble(string2);
		
		String string3 = "true";
		boolean b = Boolean.parseBoolean(string3);
		
		char data = string.charAt(0);
		char [] datas = string.toCharArray();
	}

}
