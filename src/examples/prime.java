package examples;

import java.util.Scanner;

public class prime {
	
	private static Scanner s;
	public static void main(String[] args) {
	       s = new Scanner(System.in);
	       System.out.print("Enter a Prime: ");
	       float n = s.nextInt();
	       nprime(n);
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

