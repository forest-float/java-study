package com.vector;

import java.util.List;
import java.util.Vector;
//�����ظ�
public class Demo {
	//Vector��ArrayList������������Vector���еĲ��ַ�����ʹ����synchronized�ؼ��֣�ͬ��������
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		List<String> all = new Vector<String>();
		all.add("aaa");
		all.add("bbb");
		all.add("ccc");
		System.out.println("����" + all.size() + ",�Ƿ�Ϊ�գ�" + all.isEmpty());
		for (int i = 0; i < all.size(); i++) {
			String string = all.get(i);
			System.out.println(string);
		}
		all.set(1,"ddd");
		System.out.println(all.get(1));
	}

}
