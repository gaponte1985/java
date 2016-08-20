package examples;

import java.util.Scanner;

public class prime {
	
	private static Scanner s;
	public static void main(String[] args) {
		
		do{
	       s = new Scanner(System.in);
	       System.out.print("Enter a Number: ");
	       boolean isnum;
	       do{
	    	   if(s.hasNextInt())
	    	    {
	       float n = s.nextInt();
	       isnum = true;
	       nprime(n);
	    	    } else 
	    	    {
	    	    	System.out.print("This is not a number, please enter a valid number ");
	    	    	isnum = false;
	    	    	s.next();
	    	    }
	    	   
	   }while(!(isnum));
	       System.out.println("You want to continue : (Y/N) ");
	       
    } while("Y".equalsIgnoreCase(s.next().trim()));
	}
	
	 
	
	
	public static void nprime(float n) {
		 
		 if (n <= 1 )
		 {
			 System.out.println(n+" is a not Prime number!"); 
		 }
		 else if (n == 2)
		 {
			 System.out.println(n+" is a Prime number!"); 
		 }
	 
		 else if (n%2==0 || n%3==0 || n%5==0)
		 {
			 System.out.println(n+" is a not Prime number!"); 
		 }
		 
		 else 
		 {
			 System.out.println(n+" is a Prime number!"); 
		 }
		 return;
		 }
	 
	 }

