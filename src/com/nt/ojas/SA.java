package com.nt.ojas;



class Vehicle3 {
	void run() {
		System.out.println("Vehicle");
	}
}


class SA extends Vehicle2 {
	
		 void run() {
			System.out.println("Vehicle is running");
		}
		public static void main(String args[]) {
		Vehicle2 obj = new Vehicle2();
		
		obj.run();
	}
}
