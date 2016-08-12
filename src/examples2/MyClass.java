package examples2;

public class MyClass {
	
	public static void main(String[] args)
	{
	Student Gerardo = new Student(); //Object or instance
	Gerardo.id = 1;
	Gerardo.name = "Gerardo";
	Gerardo.Last_Name = "Aponte";
	Gerardo.age = 31;
	
	
	Student Ariel = new Student(); //Object or instance
	Ariel.id = 2;
	Ariel.name = "Ariel";
	Ariel.Last_Name = "Garcia";
	Ariel.age = 31;
	
	System.out.println(Gerardo.name + " " + Gerardo.Last_Name + " is "+ Gerardo.age+ " years old" );
	System.out.println(Ariel.name + " "+ Ariel.Last_Name + " is "+ Ariel.age+ " years old" );

	
	

}
}
