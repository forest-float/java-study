
public class PetShop {
	private LinkList pets = new LinkList();
	public void add(Pet pet){//调用子类
		this.pets.add(pet);
	}
	public void delete(Pet pet){
		this.pets.remove(pet);
	}
	public LinkList search(String keyWord){
		LinkList result = new LinkList();
		Object obj[] = this.pets.toArray();
		for(int i = 0; i < this.pets.size(); i ++){
			Pet p = (Pet)obj[i];
			if(p.getName().contains(keyWord)){
				result.add(p);
			}
		}
		return result;
	}
}
