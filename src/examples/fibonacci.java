package examples;


import java.util.Scanner;



public class fibonacci {
	private static Scanner s;

	public static void main(String[] args) {
	       s = new Scanner(System.in);
	       System.out.print("Enter the value of n: ");
	       int n = s.nextInt();
	       nfibonacci(n);
	   }

	
	  public static void nfibonacci(int n) {
		
		 int a = 1;
		 int b = 0;
		 
		 for(int i =0; i < n; i++ )
		{
			int c = a+b;
			a = b;
			b = c;
			
			System.out.println("For the number " + i + " the fibonacci number is " + a   );	
		}
		
			System.out.println("The Number that you input is " + n + " and the fibonacci number is " + b   );	
		
		return ;
		
	}
	

}
