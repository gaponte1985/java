package examples;

import java.util.Scanner;

public class Stringpalindrome {
	

	private static Scanner input;

	public static void main(String[] args){
		
		input = new Scanner(System.in);
		String Palindrome;
		System.out.println("Enter a string: \n");
		Palindrome = input.next();
		
		String Reverse = new StringBuffer(Palindrome).reverse().toString();
		System.out.println(Palindrome+" is a Palindrome String!"); 
		System.out.println(Reverse+" is a Reverse String!"); 
		
		if (Reverse.equals(Palindrome))
		{
			System.out.println(Palindrome+" is a Palindrome String!"); 
		}
		else
		{
			System.out.println(Palindrome+" is not a Palindrome String!"); 
		}
		
	}

}
