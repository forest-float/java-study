


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
		//�Ƚ������Ƿ���ͬ
		System.out.println("hello".equals(stra));//�ַ�����������String����������
		
		//String ʵ���������ַ���    ֱ�Ӹ�ֵ�����췽��ʵ����
		String strc = "hello";//ֱ�Ӹ�ֵ
		//ֱ�Ӹ�ֵ�������ڶ��ڴ棬������ջ�ڴ棬    ֱ�Ӹ�ֵ����ʵ�ֶ��ڴ������
		//��ͬ�����ݵ�����£��������¶��ڴ�ռ䣬ָ��ԭ�пռ䣬��ͬ�ſ����¿ռ�
		//String ����õ��ǹ������ģʽ��ֱ�Ӹ�ֵ��������ͬ ���ڴ湲��
		String strd = new String("hello");//���췽��ʵ����
		System.out.println(strc == strd);//false ==�Ƚϵ����ڴ��ַ��new��ʾ�µ��ڴ棬���Դ���
		//���췽�����ڶѿ����ڴ汣���ַ�������ʹ��new������һ����ڴ�ռ䣬ԭ�ȶ���Ŀռ��Ϊ����
		//��������ݲ����Զ����浽�����
		//Ҳ���Խ����ֹ��������
		String stre = new String("hello").intern();//�����ֹ����
		System.out.println(strc == stre);//true
		
		// ÿһ���ַ�������һ��String�����������
		
		//String���ݵ��޸��������ù�ϵ�ı������ò�ҪƵ���޸ģ��ᵼ�´��������Ĳ���
		
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
