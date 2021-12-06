package com.nt.ojas;

public class JavaExceptionExample {
	public static void main(String args[]) {
		
       
        try
        {
            
          int a=50/0;
          
        }
		
		
        catch(ArithmeticException  e) {
			e.printStackTrace();
		}
		
			catch(NullPointerException  e) {
				e.printStackTrace();
			}
			
			
			
		catch(Exception e) {
			e.printStackTrace();
		}
			
		finally{
			System.out.println("iam good");
		}		
		System.out.println("rest of the code...");
	}
}