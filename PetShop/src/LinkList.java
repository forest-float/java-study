
public class LinkList {
	class Node{
		private Object dataObject;//�ڵ�����
		private Node nextNode;//�ڵ����һ���ڵ�
		
		public Node(Object dataObject){
			this.dataObject = dataObject;
		}
		
		public void addNode(Node node){
			if(this.nextNode == null){//�ж�this����һ���ڵ��Ƿ�Ϊ�գ����ýڵ��Ƿ������һ���ڵ�
				this.nextNode = node;
			}else{
				this.nextNode.addNode(node);
			}			
		}
		
		public Boolean containNode(Object dataObject){//�ж��Ƿ��иýڵ�����
			if(dataObject.equals(this.dataObject)){
				return true;
			}else{
				if(this.nextNode == null){
					return false;
				}else{
					return this.nextNode.containNode(dataObject);
				}
			}
		}
		
		public Object getNode(int index){
			if(LinkList.this.foot++ == index){
				return this.dataObject;
			}else{
				return this.nextNode.getNode(index);
			}
		}
		
		public void setNode(int index, Object dataObject){
			if(LinkList.this.foot++ == index){
				this.dataObject = dataObject;
			}else{
				this.nextNode.setNode(index, dataObject);
			}
		}
		
		public void removeNode(Node previous, Object dataObject){
			if(dataObject.equals(this.dataObject)){
				previous.nextNode = this.nextNode;
			}else{
				this.nextNode.removeNode(this, dataObject);
			}
		}
		public void toArrayNode(){
			LinkList.this.retArray[LinkList.this.foot++] = this.dataObject;
			if(this.nextNode != null){
				this.nextNode.toArrayNode();
			}
		}
		
		
	}
	
	private Node rootNode;//��Ŀ¼
	private int foot = 0;//����
	private int count = 0;//����Ԫ�ص�����
	private Object []retArray;//���صĽڵ���������
	
	public void add(Object newdata){
		if(newdata == null){
			return;
		}
		Node newNode = new Node(newdata);
		if(this.rootNode == null){
			this.rootNode = newNode;
		}else{
			this.rootNode.addNode(newNode);
		}
		this.count ++;
	}
	public Boolean contain(Object dataObject){
		if(dataObject == null || this.rootNode == null){
			return false;
		}else{
			return this.rootNode.containNode(dataObject);
		}
	}
	public Object get(int index){
		if(index > this.count){
			return null;
		}
		this.foot = 0;
		return this.rootNode.getNode(index);
	}
	public void set(int index, Object dataObject){
		if(index > this.count){
			return;
		}else{
			this.foot = 0;
			this.rootNode.setNode(index, dataObject);
		}
	}
	public void remove(Object dataObject){
		if(contain(dataObject)){
			if(dataObject.equals(this.rootNode.dataObject)){
				this.rootNode = this.rootNode.nextNode;
			}else{
				this.rootNode.nextNode.removeNode(this.rootNode, dataObject);
			}
			this.count --;
		}
	}
	public Object[] toArray(){
		if(this.rootNode == null){
			return null;
		}else{
			this.foot = 0;
			this.retArray = new Object[this.count];
			this.rootNode.toArrayNode();
			return this.retArray;
		}
	}
	public int size(){
		return this.count;
	}
	public Boolean isEmpty(){
		if(this.count == 0){
			return true;
		}else{
			return false;
		}
	}
	public void clear(){
		this.rootNode = null;
		this.count = 0;	}

}
