/*Theses class given a string will told you with position you wish to know
 * 
 */

package Arrays;

import java.util.Scanner;

public class CharArt {
public static void main(String args[])
	
	{
		Scanner Cadena = new Scanner(System.in);
		System.out.println("Type a new String");
		String cadena = Cadena.nextLine();
	//	cadena.replaceFirst(regex, replacement);
	//	cadena.replaceFirst(regex, replacement);
		Scanner Position = new Scanner(System.in);
		System.out.println("Type the position that you wish to know");
		int pos = Position.nextInt();
		verify(cadena,pos);
	}
		

public static void verify(String x, int y) {
	
	try {
	char ch;
	
	ch = x.charAt(y);
	System.out.println("The String is: " +x);
	System.out.println(ch);
	}catch (IndexOutOfBoundsException e) {
		System.out.println("The string is smaller than that: ");
		System.err.println("IndexOutOfTooBigException: " + e.getMessage());
}
}
}
