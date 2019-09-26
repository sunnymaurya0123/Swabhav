package com.techlabs.node.test;

import com.techlabs.node.Node;

public class NodeTest {

	public static void main(String[] args) {
		Node<Integer> n1=new Node<Integer>();
		//n1.setData("10");
		n1.setData(10);
		Node<Integer> n2=new Node<Integer>();
		n2.setData(20);
		Node<Integer> n3=new Node<Integer>();
		n3.setData(30);
		n1.setNext(n2);
		n2.setNext(n3);
		
		printInfo(n1);

	}

	private static void printInfo(Node<Integer> node) {
		while(node!=null) {
		System.out.println("data: "+node.getData()+" Next Node: "+node.getNext());
		node=node.getNext();
		}
		
	}

}
