


public class array {
	public array()
	{
		//��������һ��ȱ�㣬����ĳ��Ȳ��ɸ�
		//��������Ķ�̬������������
		int data[] = new int[3];//����������һ��3�����ȵ�int������
		//int data[][] = new int[3][3];//��ά����
		
		//int [] data = new int[3];
		
		//int data[] = null;//�ֲ����
		//data = new int[3];
		
		data[0] = 10;
		data[1] = 20;
		data[2] = 30;

		//��̬��ʼ����������ķ���
		//int data[] = {10,20,30};
		//int data[][] = {{10,20,30},{10,20,30},{10,20,30}};//��ά����
		
		//int data[] = new int[]{10,20,30};
		for(int i = 0; i < data.length; i ++){
			System.out.println(data[i]);
		}
		int tmp[] = data;//���鱾�����������������ͣ� ���Խ����������ô���
		//tmp �� dataָ�����ͬһ��ѵ�ַ���ı�����һ����Ԫ��ֵ������һ����Ԫ��ֵҲ�ı�
		tmp[2] = 40;
		for(int i = 0; i < tmp.length; i ++){
			System.out.println(tmp[i]);
		}
		for(int i = 0; i < data.length; i ++){
			System.out.println(data[i]);
		}
		java.util.Arrays.sort(data);//����������
		
		int dataA[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };		// ��������
		int dataB[] = new int[] { 11, 22, 33, 44, 55, 66, 77, 88 };// ��������
		System.arraycopy(dataA, 4, dataB, 2, 3);// ���鸴���滻
		//System.arraycopy(Դ���飬Դ���鸴�ƿ�ʼ������Ŀ�����飬Ŀ�����鸴�ƿ�ʼ����������)
		for(int i = 0; i < dataB.length; i ++){
			System.out.print(dataB[i]+"�� ");
		}
		
		String stra = "hello";
		String strb = "hello";
		
		//��String������
		if(stra == strb){//==�Ƚϵõ����ڴ��ַ����ֵ
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		if(stra.equals(strb)){//�Ƚϵ�������
			System.out.println("true");
		}
		System.out.print("hello".equals(stra));//�ַ�����������String����������
	}
	
	public void change(int temp[]){//���鴫��
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
