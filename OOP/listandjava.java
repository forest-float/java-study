//һ�����ڶ���ʱ������ʹ������һ���࣬ͬʱ����һ����Ҳ����ʹ�ñ��࣬��Ӱ����Ķ��壬���õ�ʱ���ٽ���ʵ����
public class listandjava {
	public listandjava(){
		// ��һ�������ݱ�ṹ������������
        // 1���������ԵĶ�������
        Dept dept = new Dept(10,"ACCOUNTING","New York") ;		// ������Ϣ
        Emp ea = new Emp(7369,"SMITH","CLERK",800.0,0.0) ;		// ��Ա��Ϣ
        Emp eb = new Emp(7902,"FORD","MANAGER",2450.0,0.0) ;		// ��Ա��Ϣ
        Emp ec = new Emp(7839,"KING","PRESIDENT",5000.0,0.0) ;	// ��Ա��Ϣ
        // 2�����ù�Ա���쵼��ϵ
        ea.setMgr(eb) ;										// ���ù�Ա�쵼
        eb.setMgr(ec) ;										// ���ù�Ա�쵼
        // 3�����ù�Ա�Ͳ��Ź�ϵ
        ea.setDept(dept) ;										// ��Ա�벿��
        eb.setDept(dept) ;										// ��Ա�벿��
        ec.setDept(dept) ;										// ��Ա�벿��
        dept.setEmps(new Emp[]{ea,eb,ec}) ;						// �������Ա
        // �ڶ��������ݱ�ṹ����ȡ�����õ�����
        System.out.println(ea.getInfo()) ;							// ȡ�ù�Ա��Ϣ
        System.out.println("\t|- " + ea.getMgr().getInfo()) ;				// ȡ�ù�Ա�쵼��Ϣ
        System.out.println("\t|- " + ea.getDept().getInfo()) ;				// ȡ�ù�Ա������Ϣ
        // ȡ�ò��ŵ�������Ϣ���������Ż�����Ϣ�Լ������е�����Ա����ÿ��Ա�����쵼��Ϣ
        System.out.println(dept.getInfo()) ;							// ������Ϣ
        for (int x = 0 ; x < dept.getEmps().length ; x ++) {				// ���й�Ա��Ϣ
            System.out.println("\t|- " + dept.getEmps()[x].getInfo()) ;		// ��Ա��Ϣ
            if (dept.getEmps()[x].getMgr() != null) {					// �ж��Ƿ�����쵼��Ϣ
              System.out.println("\t\t|- " + 
                       dept.getEmps()[x].getMgr().getInfo());			// �쵼��Ϣ
            }
        }
    }
}

class Dept {
   private int deptno;					// ���ű��
   private String dname;					// ��������
   private String loc;						// ����λ��
   private Emp emps [] ;					// �����Ա 
   public Dept(int deptno, String dname, String loc) {
      this.deptno = deptno;
      this.dname = dname;
      this.loc = loc;
   }
   public void setEmps(Emp [] emps){	   
	  this.emps = emps;	   
   }
   public Emp[] getEmps(){
	   return this.emps;
   }
   // setter��getter���޲ι�����
   public String getInfo() {
      return "���ű�ţ�" + this.deptno + "�����ƣ�" + this.dname + "��λ�ã�" + this.loc;
   }
}
class Emp {
   private int empno;						// ��Ա���
   private String ename;					// ��Ա����
   private String job;						// ��Աְλ
   private double sal;					// ��������
   private double comm;					// Ӷ��
   private Dept dept ;
   private Emp mgr; 					// ��ʾ��Ա��Ӧ���쵼
   public Emp(int empno, String ename, String job, double sal, double comm) {
      this.empno = empno;
      this.ename = ename;
      this.job = job;
      this.sal = sal;
      this.comm = comm;
   }
   public void setDept(Dept dept){
	   this.dept = dept;
   }
   public Dept getDept(){
	   return this.dept;
   }
   public void setMgr(Emp mgr){
	   this.mgr = mgr;
   }
   public Emp getMgr(){
	   return this.mgr;
   }
   // setter��getter���޲ι�����
   public String getInfo() {
      return "��Ա��ţ�" + this.empno + "��������" + this.ename + "��ְλ��" + this.job
             + "�����ʣ�" + this.sal + "��Ӷ��" + this.comm;
   }
}

