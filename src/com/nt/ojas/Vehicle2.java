package com.nt.ojas;

import java.util.Arrays;
import java.util.HashSet;

class Vehicle2 {
	void run() {
		System.out.println("Vehicle is running");
	}
}


class Bike2 extends Vehicle2 {
	public static void main(String args[]) {
		
		Bike2 obj = new Bike2();
		
		obj.run();
	}
}