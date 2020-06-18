
public class Dog implements Pet{
	private String name;
	private int age;
	public Dog(String name, int age){
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
		if(!(obj instanceof Dog)){//���obj����cat�����࣬����false
			return false;
		}
		Dog d = (Dog) obj;
		if(this.name.equals(d.name) && this.age == d.age){
			return true;
		}
		return false;
	}
	public String toString(){
		return "�������֣�" + this.name + "; " + "���䣺 " + this.age +";\n";
	}

}
