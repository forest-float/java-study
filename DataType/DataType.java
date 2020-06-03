/*
* @Author: wlp
* @Date:   2020-06-03 11:43:48
* @Last Modified by:   forest-float
* @Last Modified time: 2020-06-03 14:36:18
*/
public class DataType{
	public static void main(String args[]){
		System.out.println("hello !");
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		System.out.println(max+1);//最大值再加一，就是变成最小值，数据类型溢出-2147483648
		System.out.println(max+1L);//加上1L就相当于将int型数据转变成long类型数据 2147483647
		long num = 1000L;
		int intnum = (int)num;//long类型转换成int类型
		System.out.println(intnum);
		byte x = 127;//byte类型的数据范围是 -128~~127
		System.out.println(x);
		
		float f1 = 10.2F;//小数都是double类型，使用要转换成float类型
		float f2 = (float)10.2;
		System.out.println(f1*f2);//float * float = float
		
		String str = "hello";
		str = str + "world";//String 类型 字符串  字符串拼接
		System.out.println(str);
		
		int a = 10;
		int b = 20;
		int maxs = a > b ? a : b;//三目运算
		System.out.println(maxs);
		
		boolean flag = true;
		System.out.println(!flag);//逻辑运算
		
		if((1 == 2) && (10 / 0 == 0)){
			System.out.println("ok");
		}
		else{
			System.out.println("false");
		}
		/* & 全1为1，否则为0     | 有1为1      ^ 同为0，异为1    ~ 按位取反*/
		//从JDK1.7开始 switch支持字符串内容判断
		//if语句可以判断布尔表达式，switch只能判断内容
		//while先判断循环条件，再进行循环
		//do...while循环是先进行循环一次在进行判断条件
		
		//continue 与break
		for(int i = 0; i < 10; i ++){
			if(i == 3){
				continue;//之后的代码不执行，直接结束本次循环
			}
			System.out.println("i = " + i + "、");//用+进行拼接
		}
		
		printInfo();
		System.out.println(add(1 , 2));
		System.out.println(add(1.0 , 2.0));
		System.out.println(1+2.0);
	}
	
	public static void printInfo(){//如果没有传参就直接是空括号，不要写东西
		System.out.println("ok");
		System.out.println("ok");
		System.out.println("ok");
		System.out.println("ok");
	}
	public static int add(int a, int b){//方法重载    参数的类型或个数不同
		return a + b;
	}
	public static double add(double a, double b){//方法重载
		return a + b;
	}
}