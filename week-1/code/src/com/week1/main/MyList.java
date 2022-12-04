package com.week1.main;

import java.util.Arrays;

public class MyList {

	private static final int DEFAULT_CAPACITY = 5;

	private String[] stringArray;
	private int size;

	public MyList() {
		this.stringArray = new String[DEFAULT_CAPACITY];
		this.size = 0;
	}

	public void add(String str) {
		if (str.charAt(0) == 'C') {
			if (this.size == this.stringArray.length)
				grow();
			stringArray[size++] = str;
		}
	}

	public void print() {
		if (this.size == 0) 
		{
			System.out.println("Hiçbir eleman mevcut degil!");
			return;			
		}
		System.out.println("Elemanlar : ");
		for (int i = 0; i < stringArray.length && stringArray[i] != null; i++) {
			System.out.print(stringArray[i] + " ");
		}
		System.out.println();
	}

	private void grow() {
		String[] newArray = Arrays.copyOf(this.stringArray, DEFAULT_CAPACITY + 7);
		this.stringArray = newArray;
	}

	public void getSize() {
		System.out.println("size : " + this.size);
		System.out.println("length : " + this.stringArray.length);
	}
	
	public static void test() {
		MyList list = new MyList();

		list.getSize();
		list.add("Merhaba");
		list.print();
		list.add("C");
		list.add("D");
		list.add("C");
		list.add("C");
		list.add("Cem");
		list.getSize();
		list.add("Can");
		list.getSize();
		list.add("Canan");
		list.getSize();
		list.print();
	}

}
