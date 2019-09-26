package com.techlabs.adapter;

public interface IQueue<T> extends Iterable<T>{
	
	T dequeue();
	int count();
	void enqueue(T t);
	
}
