package ClassConstructor;

public class Cube {
	int length;
	int bredth;
	int height;
	
		public int getCubeVoulumen()
		{
			return (length * bredth * height);
		}
	
		Cube(){
			
			length = 30;
			bredth = 20;
			height = 30;
			System.out.println("we are in constructor");
		}
		
        Cube(int l, int b, int h){
			
			length = l;
			bredth = b;
			height = h;
			System.out.println("we are in constructor overloading");
		}

}
