package com.nt.ojas;

class SantuException extends Exception{
	 SantuException(String str){
		super(str);
	}
}
public class Demo2 {
	public static void main(String args[]) {

		try {
			int age =17;
			if(age<18)
			throw new SantuException("ur not eligilable for marry");
		}
		catch(SantuException e) {
			e.printStackTrace();
		}
	}
}
