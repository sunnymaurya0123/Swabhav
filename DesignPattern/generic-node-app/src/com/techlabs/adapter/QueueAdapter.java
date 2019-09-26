package com.techlabs.adapter;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueAdapter<T> implements IQueue<T> {

	private LinkedList<T> queue=new LinkedList<T>();
	private int count;

	@Override
	public void enqueue(T item) {
		
		queue.add(item);
		count++;
	}

	@Override
	public T dequeue() {
		count--;
		return queue.removeFirst();
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public Iterator<T> iterator() {
		return queue.iterator();
	}

	
	
	
}
