package com.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Map<String, Integer> all = new HashMap<String, Integer>();
		all.put("aaa", 1);
		all.put("bbb", 2);
		all.put("ccc", 3);
		all.put("ddd", 4);
		all.put(null, null);//�������null  �첽����  ���̰߳�ȫ
		System.out.println(all.get("bbb"));
		System.out.println(all.get("ddd"));
		System.out.println(all);
	}

}
