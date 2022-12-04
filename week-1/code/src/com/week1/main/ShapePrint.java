package com.week1.main;


public class ShapePrint {
	
	public static void print(String shape) {
		System.out.format("%s%"+(15-shape.length())+"s\n",shape,shape);
	}

	public static void run() {
		String str = "*";
		for (int i = 0; i <= 5; i++) {
			print(str);
			str +="*";
		}
	}
	
}
