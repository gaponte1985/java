package MethodOverloading;

public class MyClass {
	
	public static void main(String[] args){
		System.out.println(Add(1,36));
		System.out.println(Add(25.2, 10.5));
		System.out.println(Add("Hello", " World!!!"));
		
	}
	
		public static int Add (int a, int b){		
		return(a+b);
		
	}
		
		public static double Add (double a, double b){		
			return (a+b);
			
		}
		
		public static String Add (String a, String b){		
			return(a+b);
			
		}
	
	}



