package com.techlabs.oddeven.test;

import com.techlabs.oddeven.OddEven;

public class OddEvenTest {

	public static void main(String[] args) {
		OddEven oddevenObject=new OddEven(10);
//		oddevenObject.printEvenNumber();
//		oddevenObject.setRange(100);
//		oddevenObject.printOddNumber();
//		oddevenObject.setRange(10);
//		oddevenObject.printEvenNumber();
//		oddevenObject.setRange(50);
//		oddevenObject.printOddNumber();
		int[] even,odd;
		even=oddevenObject.getEvenNumbers();
//		for(int i=0;i<secondArray.length;i++) {
//			System.out.println(secondArray[i]);
//		}
		System.out.println("Even Numbers: ");
		for(int i=0;i<even.length;i++) {
				System.out.print(even[i]+" ");
		}
		System.out.println();
		odd=oddevenObject.getOddNumbers();
		System.out.println("Odd Numbers: ");
		for(int i=0;i<odd.length;i++) {
				System.out.print(odd[i]+" ");
		}
	}

}
