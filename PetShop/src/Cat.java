//Object    ���������������ͣ����飬�ӿڣ���
public class Cat implements Pet{
	private String name;
	private int age;
	public Cat(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void setname(String name){
		this.name = name;
	}
	public void setage(int  age){
		this.age = age;
	}
	public String getname(){
		return this.name;
	}
	public int getage(){
		return this.age;
	}	
	public String getName(){
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(obj == null){
			return false;
		}
		if(!(obj instanceof Cat)){//���obj����cat�����࣬����false
			return false;
		}
		Cat cat = (Cat) obj;
		if(this.name.equals(cat.name) && this.age == cat.age){
			return true;
		}
		return false;
	}
	public String toString(){
		return "è�����֣�" + this.name + "; " + "���䣺 " + this.age +";\n";
	}
}
