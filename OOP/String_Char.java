
public class String_Char {
	public void f1(String str){
		char c = str.charAt(0);//截取第一个字符
		System.out.println(c);
	}
	public void f2(String str){
		char [] data  = str.toCharArray();//将字符串变成字符数组
		for(int i = 0; i < data.length; i++){
			System.out.println(data[i]);
		}
	}
	public void f3(char[] data){
		String str = new String(data);//将字符数组转换从成字符串		
		System.out.println(str);		
	}
	public void f4(String str){
		String data = str.toLowerCase();//转小写
		System.out.println(data);	
	}
	public void f5(String str){
		String data = str.toUpperCase();//转大写
		System.out.println(data);	
	}
	public void f6(String str){
		//String data = str.toUpperCase();//转大写
		System.out.println(str.length());	//长度
	}
	public void f7(String str){
		//String data = str.toUpperCase();//转大写
		System.out.println(str.isEmpty());	//是否为空
	}
	public void f8(String str){
		//String data = str.toUpperCase();//转大写
		System.out.println(str.isEmpty());	//是否为空
	}
	public void f9(String str){
		//String data = str.toUpperCase();//转大写
		System.out.println(str.startsWith("h"));	//是否以“h”开头
	}
	public void f10(String str){
		//String data = str.toUpperCase();//转大写
		System.out.println(str.endsWith("h"));	//是否以“h”结尾
	}
	public void f11(String str){
		//String data = str.toUpperCase();//转大写
		String [] data = str.split(",");//将str以","进行查分
		for(int i =0; i < data.length; i++){
			System.out.println(data[i]);	
		}		
	}
	public void f12(char [] data, int offset, int count){
		String str = new String(data, offset, count);//将部分字符数组转换成字符串
		System.out.println(str);
	}
	public void f13(String str){//char:0~255    byte:-128~127
		byte[] data = str.getBytes();//将字符串变为字节数组
		for(int i = 0; i < data.length; i++){
			System.out.println(data[i]);
		}		
	}
	public void f14(String str){
		String data = "hello";
		System.out.println(str.compareTo(data));//判断两个字符串的大小
	}
	public void f15(String str){
		System.out.println(str.contains("hello"));//判断指定内容是否存在
		System.out.println(str.indexOf("hello"));//由前到后查找指定字符串的位置，找到返回位置索引
		System.out.println(str.startsWith("hello"));//是否以指定字符串开始
		System.out.println(str.endsWith("hello"));//是否以指定字符串结尾
	}
	public void f16(String str){
		String stra = str.replaceAll("l", "_");//字符串的替换   替换全部
		String strb = str.replaceFirst("l", "_");//字符串的替换 ，只替换第一个
		System.out.println(stra);
		System.out.println(strb);
	}
	public void f17(String str){
		String data = str.substring(2);//字符串的截取  从索引到结尾
		String datas = str.substring(0, 5);//字符串的截取  只截取部分字符串
		System.out.println(data);
		System.out.println(datas);
	}
	public void f18(String str){
		String [] data = str.split("/");//根据/来进行拆分  如果是空字符串，就一个一个字符拆分
		for(int i = 0; i < data.length; i ++){
			System.out.println(data);
		}
		String [] datas = str.split("/",3);//指定拆分的个数
		for(int i = 0; i < datas.length; i ++){
			System.out.println(datas);
		}
		
		//要避免正则表达式的影响，  这里用.是不能正常执行的，必须要对要拆分的.进行转义，在java中转义用“\\”
		String numString = "192.168.1.2";
		String [] num1 = numString.split(".");
		for(int i = 0; i < num1.length; i ++){
			System.out.print(num1[i] + "、");
		}
		String [] num2 = numString.split("\\.");
		for(int i = 0; i < num2.length; i ++){
			System.out.print(num2[i] + "、");
		}
		
	}
	
}
