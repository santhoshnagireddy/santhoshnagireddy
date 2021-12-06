package com.nt.ojas;

class Demo1 {

	Demo1() {
		
		System.out.println("Base class default constructor called");
	}

Demo1(int a) {
		
		System.out.println("Base class default constructor called");
	}


	Demo1(int x, int y) {
		this(x);
		System.out.println("Base class parameterized constructor called");
	}
}



public class ConstructorChaining {
 
	public static void main(String args[]) {

		 Demo1 a = new Demo1(5,7);
	}
}