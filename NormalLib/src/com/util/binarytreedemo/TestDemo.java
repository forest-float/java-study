package com.util.binarytreedemo;

import java.util.Arrays;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bTree = new BinaryTree();
		bTree.add(new Book("aaa",1.1));
		bTree.add(new Book("bbb",2.2));
		bTree.add(new Book("ccc",3.3));
		bTree.add(new Book("ddd",4.4));
		Object obj[] = bTree.toArray();
		System.out.println(Arrays.toString(obj));
		
	}

}
class Book implements Comparable<Book>{
	private String title;
	private double pirce;
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		if(this.pirce > o.pirce) {
			return 1;
		}else if(this.pirce == o.pirce) {
			return 0;
		}else {
			return -1;
		}		
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + pirce + "]";
	}
	public Book(String title, double price) {
		super();
		this.title = title;
		this.pirce = price;
	}
	
}

@SuppressWarnings("rawtypes")
class BinaryTree{
	private class Node{		
		private Comparable data;
		private Node left;
		private Node right;
		public Node(Comparable data) {
			this.data = data;
		}
	
		@SuppressWarnings("unchecked")
		public void addNode(Node newNode) {
			if(this.data.compareTo(newNode.data) > 0){//比大小
				if(this.left == null) {//左子树
					this.left = newNode;
				}else {
					this.left.addNode(newNode);
				}
			}else {
				if(this.right == null) {//右子树
					this.right = newNode;
				}else {
					this.right.addNode(newNode);
				}
			}
		}
		public void toArrayNode() {
			if(this.left != null) {//有左子树
				this.left.toArrayNode();//左子树继续取得
			}
			//先判断是否有左节点再取出中间节点，再取出右节点
			BinaryTree.this.retData[BinaryTree.this.foot++] = this.data;
			if(this.right != null) {
				this.right.toArrayNode();
			}			
		}
	}
	
	private Node root;//存放根节点
	private int count;//计算总共多少数据
	private Object[] retData;//用于存放返回的对象数组
	private int foot;//操作脚标
	public void add(Object obj) {//添加节点
		Comparable com = (Comparable) obj;//转换为comparable才可以实现节点Node
		Node newNode = new Node(com);//创建新节点
		if(this.root == null) {
			this.root = newNode;//如果不存在根节点，添加为根节点
		}else {
			this.root.addNode(newNode);
		}
		this.count ++;
		
	}
	public Object[] toArray() {//取得全部保存数据
		if(this.root == null) {
			return null;			
		}
		this.foot = 0;//重置脚标
		this.retData = new Object[this.count];//开辟爆粗数据的数组
		this.root.toArrayNode();
		return this.retData;
	}
}

