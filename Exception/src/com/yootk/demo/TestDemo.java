package com.yootk.demo;

public class TestDemo {
	public static void main(String args[]){
		int num = 10;
		assert num == 20:"内容是10";
		
		System.out.println("1. 除法计算开始。");
		try {
			System.out.println("2. 除法计算：" + (10 / 0));		// 此处产生异常
			// 异常产生之后的语句将不再执行，此处在try中产生异常，所以下面的输出不会执行 
			System.out.println("更多课程请访问：www.yootk.com");
		} catch (ArithmeticException e) {						// 处理算术异常
			System.out.println("******** 出现异常了 *********");
			e.printStackTrace();
		} catch (Exception e) {//获取全部异常
			// TODO: handle exception
			e.printStackTrace();
		} finally{
			System.out.println("2. 除法计算：" );
		}
		System.out.println("3. 除法计算结束。");
		
		try{
			System.out.println(div(1, 0));
			throw new Exception("自己定义的异常");
		}catch(Exception e){
			System.out.println("******** 出现异常了 *********");
		}
		
	}
	
	//throws关键字主要在方法定义上引用，表示此方法不处理异常，交给被调用处处理
	public static int div(int x, int y) throws Exception{
		return  x / y;
	}

	//RuntimeException在编译时不会强制要求进行异常的处理，用户可以根据将自己的需求有选择性的进行处理
}
