package com.util.newJava;
//���ͽӿ�
public interface IMessage <T>{
	public void print(T t);

}
//���������Ƿ���
class MessageImpl<S> implements IMessage<S>{

	@Override
	public void print(S t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	//ʹ��
	//IMessage<String> msg = new MessageImple<String>();
}
//�����಻�������ͣ�Ϊ���ӿ���ȷ����һ����������
class MessageImples implements IMessage<String>{

	@Override
	public void print(String t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	//ʹ��
	//IMessage<String> msg = new MessageImples();
}
