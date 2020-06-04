


public class array {
	public array()
	{
		//数组最大的一个缺点，数组的长度不可改
		//三种数组的动态定义声明方法
		int data[] = new int[3];//声明并开辟一个3个长度的int型数组
		//int data[][] = new int[3][3];//二维数组
		
		//int [] data = new int[3];
		
		//int data[] = null;//分步完成
		//data = new int[3];
		
		data[0] = 10;
		data[1] = 20;
		data[2] = 30;

		//静态初始化定义数组的方法
		//int data[] = {10,20,30};
		//int data[][] = {{10,20,30},{10,20,30},{10,20,30}};//二维数组
		
		//int data[] = new int[]{10,20,30};
		for(int i = 0; i < data.length; i ++){
			System.out.println(data[i]);
		}
		int tmp[] = data;//数组本身属于引用数据类型， 可以进行数组引用传递
		//tmp 和 data指向的是同一块堆地址，改变其中一个的元素值，另外一个的元素值也改变
		tmp[2] = 40;
		for(int i = 0; i < tmp.length; i ++){
			System.out.println(tmp[i]);
		}
		for(int i = 0; i < data.length; i ++){
			System.out.println(data[i]);
		}
		java.util.Arrays.sort(data);//数组排序函数
		
		int dataA[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };		// 定义数组
		int dataB[] = new int[] { 11, 22, 33, 44, 55, 66, 77, 88 };// 定义数组
		System.arraycopy(dataA, 4, dataB, 2, 3);// 数组复制替换
		//System.arraycopy(源数组，源数组复制开始索引，目标数组，目标数组复制开始索引，长度)
		for(int i = 0; i < dataB.length; i ++){
			System.out.print(dataB[i]+"、 ");
		}
		
		String stra = "hello";
		String strb = "hello";
		
		//在String对象中
		if(stra == strb){//==比较得的是内存地址的数值
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		if(stra.equals(strb)){//比较的是内容
			System.out.println("true");
		}
		System.out.print("hello".equals(stra));//字符串常量就是String的匿名对象
	}
	
	public void change(int temp[]){//数组传递
		for(int i = 0; i < temp.length; i ++){
			temp[i] = i; 
		}
	}
	public void sortarray(int array[]){
		int tmp = 0;
		for(int i = 0; i < array.length; i ++){
			for(int j = i + 1; j < array.length; j ++){
				if(array[i] > array[j]){
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp; 
				}
			}
			//System.out.println(array[i]);
		}

	}

}
