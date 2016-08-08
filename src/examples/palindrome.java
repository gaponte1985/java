package examples;

import java.util.Scanner;

public class palindrome {

	private static Scanner s;
	
	public static void main(String[] args) {
    s = new Scanner(System.in);
    System.out.print("Enter any number value ");
    int n = s.nextInt();
    npalindrome(n);
    
}
	 public static void npalindrome(int n) {
	int num =0; 
	num = n;
    //reversing number
    int rev=0,rmd; 
    while(num > 0) 
    { 
      rmd = num % 10; 
      rev = rev * 10 + rmd; 
      num = num / 10; 
    } 
    if(rev == n){
      System.out.println(n+" is a Palindrome Number!"); 
    
    }else
    {
      System.out.println(n+" is not a Palindrome Number!"); 
  } 
 return ;
}
}