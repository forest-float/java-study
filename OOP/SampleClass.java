
/** * 
 * @author wlp
 * ��java�۵Ļ�������Ҫ��
 * ������Ʊ����������
 * �������е����Ա���private���з�װ����װ������Ա���ͬ�ṩsetter,getter
 * ���п����ṩ���������췽�������Ǳ��뱣��һ���ݴ��εĹ��췽��
 * ���в���������κ������䣬���е���Ϣ������뽻�������ô����
 * ������Ҫ�ṩһ�����Ķ���������Ϣ�ķ������ݶ�ΪgetInfo()�����ҷ��ص���String�������� *
 */


public class SampleClass {
	private int empno;					// ��Ա���
    private String ename;					// ��Ա����
    private String job;					// ��Աְλ
    private double sal;					// ��������
    private double comm;					// Ӷ��

	public SampleClass(){
		
	}
	public SampleClass(int eno, String ena, String j, double s, double c) {	// �вι���
		empno = eno;					// Ϊ���Ը�ֵ
		ename = ena;					// Ϊ���Ը�ֵ
		job = j;						// Ϊ���Ը�ֵ
		sal = s;						// Ϊ���Ը�ֵ
		comm = c;						// Ϊ���Ը�ֵ
	}

	public void setEmpno(int e) {				// ����empno��������
        empno = e;
    }
    public void setEname(String e) {			// ����ename��������
        ename = e;
    }
    public void setJob(String j) {				// ����job��������
        job = j;
    }
    public void setSal(double s) {				// ����sal��������
        sal = s;
    }
    public void setComm(double c) {			// ����comm��������
        comm = c;
    }
    public int getEmpno() {					// ȡ��empno��������
        return empno;
    }
    public String getEname() {				// ȡ��ename��������
        return ename;
    }
    public String getJob() {					// ȡ��job��������
        return job;
    }
    public double getSal() {					// ȡ��sal��������
        return sal;
    }
    public double getComm() {				// ȡ��comm��������
        return comm;
    }

    /**
     * ȡ�ü�Java��Ļ�����Ϣ����Ϣ�ڱ����ô����
     * @return ��������������Ϣ���ַ�������
     */
    public String getInfo() {			// ȡ��������Ϣ
        return "��Ա��ţ�" + empno + "\n" +
               "��Ա������" + ename + "\n" + 
               "��Աְλ��" + job + "\n" + 
               "�������ʣ�" + sal + "\n" + 
               "Ӷ    ��" + comm ;
    }
}
