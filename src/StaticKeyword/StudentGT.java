package StaticKeyword;

public class StudentGT {
	
	String name;
	String Last_Name;
	int age;	
	static int NoOfStudentGT = 0;
	
	StudentGT(){
		NoOfStudentGT++;
	}
	
	public static int getNoOfStudentGT(){
		return NoOfStudentGT;
	}
	
	int id;
	public int getId(int i) {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
