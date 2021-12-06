package com.nt.ojas;

class  Parent{  
	   void PrintData() {  
	      System.out.println("method of parent class");  
	   }  
	}  
	  
	class Child extends Parent {  
	   void PrintData() {  
	      System.out.println("method of child class");  
	   }  
	}  
	class UpcastingExample{  
	   public static void main(String args[]) {  
	        
		   Parent p = new Child();  
	     
		   Child c = (Child)p;   
		    
	      
	      c.PrintData();   
	   }  
	}  
