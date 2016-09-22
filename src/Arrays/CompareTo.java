package Arrays;

import java.util.Scanner;

public class CompareTo {

	
public static void main(String args[])
	
	{
		Scanner Cadena = new Scanner(System.in);
		System.out.println("Type the firts String");
		String cadena = Cadena.nextLine();
		
		Scanner Cadena1 = new Scanner(System.in);
		System.out.println("Type the Sencond String");
		String cadena1 = Cadena1.nextLine();
		
		 int resul;
		 resul = cadena.compareTo(cadena);
		 
		 System.out.println(resul);
}
}
