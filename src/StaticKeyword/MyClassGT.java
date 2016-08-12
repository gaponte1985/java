package StaticKeyword;

public class MyClassGT {
	
	public static void main(String[] args)
	{
		StudentGT Gerardo = new StudentGT();
		System.out.println(Gerardo.getNoOfStudentGT());
		StudentGT Ariel = new StudentGT();
		System.out.println(Ariel.getNoOfStudentGT());
		StudentGT Tom = new StudentGT();
		System.out.println(Tom.getNoOfStudentGT());
		
		
		System.out.println(StudentGT.getNoOfStudentGT());
		
/*
	StudentGT Gerardo = new StudentGT(); //Object or instance
	Gerardo.getId(1);
	Gerardo.setName("Gerardo");
	Gerardo.setLast_Name("Aponte") ;
	Gerardo.setAge(31);
	
	
	StudentGT Ariel = new StudentGT(); //Object or instance
	Ariel.getId(2);
	Ariel.setName("Ariel") ;
	Ariel.setLast_Name("Garcia") ;
	Ariel.setAge(31);
	
	System.out.println(Gerardo.getName() + " " + Gerardo.getLast_Name() + " is "+ Gerardo.getAge() + " years old" );
	System.out.println(Ariel.getName()  + " "+ Ariel.getLast_Name() + " is "+ Ariel.getAge() + " years old" );

	*/
	

}
}
