//一个类在定义时，可以使用另外一个类，同时另外一个类也可以使用本类，不影响类的定义，在用的时候再进行实例化
public class listandjava {
	public listandjava(){
		// 第一步：根据表结构描述设置数据
        // 1．产生各自的独立对象
        Dept dept = new Dept(10,"ACCOUNTING","New York") ;		// 部门信息
        Emp ea = new Emp(7369,"SMITH","CLERK",800.0,0.0) ;		// 雇员信息
        Emp eb = new Emp(7902,"FORD","MANAGER",2450.0,0.0) ;		// 雇员信息
        Emp ec = new Emp(7839,"KING","PRESIDENT",5000.0,0.0) ;	// 雇员信息
        // 2．设置雇员和领导关系
        ea.setMgr(eb) ;										// 设置雇员领导
        eb.setMgr(ec) ;										// 设置雇员领导
        // 3．设置雇员和部门关系
        ea.setDept(dept) ;										// 雇员与部门
        eb.setDept(dept) ;										// 雇员与部门
        ec.setDept(dept) ;										// 雇员与部门
        dept.setEmps(new Emp[]{ea,eb,ec}) ;						// 部门与雇员
        // 第二步：根据表结构描述取得设置的数据
        System.out.println(ea.getInfo()) ;							// 取得雇员信息
        System.out.println("\t|- " + ea.getMgr().getInfo()) ;				// 取得雇员领导信息
        System.out.println("\t|- " + ea.getDept().getInfo()) ;				// 取得雇员部门信息
        // 取得部门的完整信息，包括部门基础信息以及部门中的所有员工和每个员工的领导信息
        System.out.println(dept.getInfo()) ;							// 部门信息
        for (int x = 0 ; x < dept.getEmps().length ; x ++) {				// 所有雇员信息
            System.out.println("\t|- " + dept.getEmps()[x].getInfo()) ;		// 雇员信息
            if (dept.getEmps()[x].getMgr() != null) {					// 判断是否存在领导信息
              System.out.println("\t\t|- " + 
                       dept.getEmps()[x].getMgr().getInfo());			// 领导信息
            }
        }
    }
}

class Dept {
   private int deptno;					// 部门编号
   private String dname;					// 部门名称
   private String loc;						// 部门位置
   private Emp emps [] ;					// 多个雇员 
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
   // setter、getter、无参构造略
   public String getInfo() {
      return "部门编号：" + this.deptno + "，名称：" + this.dname + "，位置：" + this.loc;
   }
}
class Emp {
   private int empno;						// 雇员编号
   private String ename;					// 雇员姓名
   private String job;						// 雇员职位
   private double sal;					// 基本工资
   private double comm;					// 佣金
   private Dept dept ;
   private Emp mgr; 					// 表示雇员对应的领导
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
   // setter、getter、无参构造略
   public String getInfo() {
      return "雇员编号：" + this.empno + "，姓名：" + this.ename + "，职位：" + this.job
             + "，工资：" + this.sal + "，佣金：" + this.comm;
   }
}

