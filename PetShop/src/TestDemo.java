import java.util.StringTokenizer;


interface Message{
	public void print();
}
class MessageImpl implements Message{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("���ݽӿڵ�����ʵ��������");
	}	
}
public class TestDemo {
	public static void main(String args[]){
		PetShop shop = new PetShop();
		//���սӿڶ��󣬿��Դ�������ʵ��������
		shop.add(new Cat("��˹è",1)) ;		// ���ӳ���
		shop.add(new Cat("����è",2)) ;		// ���ӳ���
		shop.add(new Cat("������è",1)) ;		// ���ӳ���
		shop.add(new Dog("��ʨ",1)) ;			// ���ӳ���
		shop.add(new Dog("������",2)) ;		// ���ӳ���
		shop.delete(new Cat("������è",9)) ;	// ɾ��������Ϣ
		LinkList all = shop.search("��");
		Object [] dataObjects = all.toArray();
		for (int i = 0; i < dataObjects.length; i++) {
			System.out.println(dataObjects[i]);
		}
		fun(new MessageImpl());//��������ʵ��������
		fun(new Message() {//�ڴ������涨�������ڲ���
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("�����ڲ���");
			}
		});
	}
	public static void fun(Message msg){
		msg.print();
		
	}
	@SuppressWarnings("unused")
	public static void datatype(){//�����������͵İ�װ��
		Integer i = new Integer(10);	//��������������װ��	
		Byte b = new Byte((byte) 0);
		Short s = new Short((short) 1);
		Character character = new Character('c');
		Long long1 = new Long(1L);
		Float float1 = new Float(10.0);
		Double double1 = new Double(1.0);
		Boolean boolean1 = new Boolean(false);
		
		int iint = i.intValue();//�������������Ͳ���
		byte bs = b.byteValue();
		short ss = s.shortValue();
		char c = character.charValue();
		long l = long1.longValue();
		float f = float1.floatValue();
		double d = double1.doubleValue();
		boolean bss = boolean1.booleanValue();
		
		Boolean bsBoolean = true;//�Զ�װ��
		boolean bssss = bsBoolean;//�Զ�����
	}
	@SuppressWarnings("unused")
	public static void StringTokenizer(){//�������͵�ת��
		String string  = "123";
		int temp = Integer.parseInt(string);//string���治�ܳ��ַ����ֵ��ַ�
		
		String string2 = "1.2";
		double d = Double.parseDouble(string2);
		
		String string3 = "true";
		boolean b = Boolean.parseBoolean(string3);
		
		char data = string.charAt(0);
		char [] datas = string.toCharArray();
	}

}
