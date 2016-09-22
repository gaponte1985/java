/*
 * Compare two String to see if they are the same
 * 
 */
package Arrays;

import java.util.Scanner;

public class Equals {
	
	public static void main(String args[])
	
	{
		Scanner Cadena = new Scanner(System.in);
		System.out.println("Type the firts String");
		String cadena = Cadena.nextLine();
		
		Scanner Cadena1 = new Scanner(System.in);
		System.out.println("Type the Sencond String");
		String cadena1 = Cadena1.nextLine();
		
		if (cadena.equals(cadena1))
		{
			System.out.println("There are the same String");
		}
		else if(cadena.equalsIgnoreCase(cadena1))
		{
			System.out.println("There so Case that me ignore so we can make it the same String");
		}
		else
		{
			System.out.println("There are NOT the same String");
		}
		
	}

}
