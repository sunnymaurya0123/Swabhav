package com.techlabs.boxing;

import java.util.ArrayList;

public class Boxing {

	public static void main(String[] args) {
		int num=4;
		Integer in=Integer.valueOf(num);
		
		int x=5;
		Integer i=x;
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(i);
		int number=list.get(1);
		list.set(1, 5);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.size());

	}

}
