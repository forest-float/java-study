//Object    包括引用数据类型，数组，接口，类
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
		if(!(obj instanceof Cat)){//如果obj不是cat的子类，返回false
			return false;
		}
		Cat cat = (Cat) obj;
		if(this.name.equals(cat.name) && this.age == cat.age){
			return true;
		}
		return false;
	}
	public String toString(){
		return "猫的名字：" + this.name + "; " + "年龄： " + this.age +";\n";
	}
}
