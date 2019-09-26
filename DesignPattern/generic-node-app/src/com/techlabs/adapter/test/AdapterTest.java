package com.techlabs.adapter.test;

import com.techlabs.adapter.IQueue;
import com.techlabs.adapter.QueueAdapter;

public class AdapterTest {

	public static void main(String[] args) {
		IQueue<Integer> q;
		q=new QueueAdapter<Integer>();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		System.out.println("Total items before deletion");
		printInfo(q);
		System.out.println();
		System.out.println("Deleted item: "+q.dequeue());
		System.out.println("\n");
		System.out.println("Total items after deletion");
		printInfo(q);
		System.out.println();
		q.enqueue(10);
		System.out.println("Total items after addition");
		printInfo(q);
		

	}

	private static void printInfo(IQueue<Integer> q) {
		for(Integer item:q)
			System.out.print(item+" ");
		System.out.println("\nTotal count: "+q.count());
		
		
	}

}
