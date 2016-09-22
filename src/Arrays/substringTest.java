/* 
 *I am typing a String and sending a  parameter will erase the first and last caracter 
 * 
 * 
*/
package Arrays;

import java.io.*;
import java.util.Scanner;
public class substringTest {
	
	public static void substringMethods(String word1, int front, int back)
	     {

	      System.out.print("Return Value : \n" );
	      System.out.println("The orginal String is: "+word1);
	      System.out.println(word1.substring(front, (word1.length() - back)));
	      System.out.println(word1.substring(front));
	      System.out.println(word1.substring(0, word1.length() - back) );
	     // word1.startsWith();
	     
	     }

	    public static void main(String args[]) {
	     Scanner Word = new Scanner(System.in);
	     System.out.println("Write the String that you want to used");
	      String word  = Word.nextLine();
	     Scanner Number = new Scanner(System.in);
	     System.out.println("How many word you want to erase");
	      int number = Number.nextInt();
		 
	     Scanner Number1 = new Scanner(System.in);
	     System.out.println("How many word from the back you want too erase");
	      int number1 = Number1.nextInt();
	     substringMethods(word,number,number1);
	     
	 }

}
