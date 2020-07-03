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
			if(this.data.compareTo(newNode.data) > 0){//�ȴ�С
				if(this.left == null) {//������
					this.left = newNode;
				}else {
					this.left.addNode(newNode);
				}
			}else {
				if(this.right == null) {//������
					this.right = newNode;
				}else {
					this.right.addNode(newNode);
				}
			}
		}
		public void toArrayNode() {
			if(this.left != null) {//��������
				this.left.toArrayNode();//����������ȡ��
			}
			//���ж��Ƿ�����ڵ���ȡ���м�ڵ㣬��ȡ���ҽڵ�
			BinaryTree.this.retData[BinaryTree.this.foot++] = this.data;
			if(this.right != null) {
				this.right.toArrayNode();
			}			
		}
	}
	
	private Node root;//��Ÿ��ڵ�
	private int count;//�����ܹ���������
	private Object[] retData;//���ڴ�ŷ��صĶ�������
	private int foot;//�����ű�
	public void add(Object obj) {//��ӽڵ�
		Comparable com = (Comparable) obj;//ת��Ϊcomparable�ſ���ʵ�ֽڵ�Node
		Node newNode = new Node(com);//�����½ڵ�
		if(this.root == null) {
			this.root = newNode;//��������ڸ��ڵ㣬���Ϊ���ڵ�
		}else {
			this.root.addNode(newNode);
		}
		this.count ++;
		
	}
	public Object[] toArray() {//ȡ��ȫ����������
		if(this.root == null) {
			return null;			
		}
		this.foot = 0;//���ýű�
		this.retData = new Object[this.count];//���ٱ������ݵ�����
		this.root.toArrayNode();
		return this.retData;
	}
}

