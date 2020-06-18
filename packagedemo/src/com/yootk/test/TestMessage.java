package com.yootk.test;
import com.yootk.util.Message;//导入需要的类

import com.yootk.util.*;//只会在使用的使用才导入使用的类，不使用的类不导入，和导入特定类的性能一样


@SuppressWarnings("unused")
public class TestMessage {
	public static void main(String args[]){
		Message msg = new Message();
		msg.print();
	}

}
