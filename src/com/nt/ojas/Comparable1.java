package com.nt.ojas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student  {
	private int sno;
	private String sname;
	private String address;
	public Student(int sno, String sname, String address) {
		
		this.sno = sno;
		this.sname = sname;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sno=" + getSno() + ", sname=" + getSname() + ", address=" + address + "]";
	}
	public String getSname() {
		return sname;
	}
	public int getSno() {
		return sno;
	}
	
	
}

public class Comparable1 {

	public static void main(String[] args) {
		List<Student>al=new ArrayList<>();
		al.add(new Student(2,"a","bkp"));
		al.add(new Student(1,"c","bkp"));
		al.add(new Student(3,"b","bkp"));
		
		Collections.sort(al,new Santu());
		al.forEach(x->System.out.println(x));
		
	}

}
class Santu implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getSname().compareTo(o2.getSname());
	}
	
}
