package com.techlabs.oddeven;

public class OddEven {
	private int range;

	// private int[] number=new int[range];
	public OddEven(int userNumber) {
		this.range = userNumber;

	}

	public void printEvenNumber() {
		System.out.println("\nEven Numbers till " + range + " are");
		for (int i = 0; i <= range; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public void printOddNumber() {
		System.out.println("Odd Numbers till " + range + " are");

		for (int i = 0; i <= range; i++) {
			if (i % 2 != 0)
				System.out.print(i + " ");
		}
	}

	public void setRange(int number) {
		this.range = number;
	}

	public int[] getEvenNumbers() {

		int[] even = new int[range/2];
		int j=0;
		for (int i = 0; i < range; i++) {
			if (i % 2 == 0) {
				even[j] = i;
				j++;
			}
		}
		return even;
	}

	public int[] getOddNumbers() {

		int[] odd = new int[range/2];
		int j=0;
		for (int i = 0; i <range; i++) {
			if (i % 2 != 0) {
				odd[j] = i;
				j++;
			}
		}
		return odd;
	}

}
