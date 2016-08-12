package ClassConstructor;

public class MyClass {
	
	public static void main(String[] args) {
		
		Cube cube1 = new Cube();
		System.out.println(cube1.getCubeVoulumen());
		
		Cube cube2 = new Cube(10,10,10);
		System.out.println(cube2.getCubeVoulumen());
	}

}
