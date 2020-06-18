package com.util.newJava;
//泛型接口
public interface IMessage <T>{
	public void print(T t);

}
//子类继续标记泛型
class MessageImpl<S> implements IMessage<S>{

	@Override
	public void print(S t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	//使用
	//IMessage<String> msg = new MessageImple<String>();
}
//在子类不设置类型，为父接口明确定义一个泛型类型
class MessageImples implements IMessage<String>{

	@Override
	public void print(String t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	//使用
	//IMessage<String> msg = new MessageImples();
}
