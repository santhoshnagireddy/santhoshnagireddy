
//in abstarct class supports abstarct and conceret and static methods and constructors 
//it does not support default methods

package com.nt.ojas;

abstract class Bike {
	private int eid;
	private String ename;

	public Bike(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;

	}

	void dispaly() {
		System.out.println(eid + " " + ename);
	}

}

class Honda extends Bike {

	public Honda(int eid, String ename) {
		super(eid, ename);

	}

}

// Creating a Test class which calls abstract and non-abstract methods
class AbstractConcepts {
	public static void main(String args[]) {
		Honda obj = new Honda(1, "santu");
		obj.dispaly();

	}
}
