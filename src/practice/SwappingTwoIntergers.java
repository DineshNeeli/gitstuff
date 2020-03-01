package practice;

public class SwappingTwoIntergers {

	public static void main(String[] args) {

		int x = 10;
		int y = 5;
		
		System.out.println("Before swapping ");
		System.out.println("value of x is :" + x);
		System.out.println("value of y is :" + y);
		System.out.println("*******************************************");
		
		
		//1. using third var
		
//		int t;
//		
//		t = x;
//		x = y;
//		y = t;
		
//		//2. using addition
//		
//		x = x+y;
//		y = x-y;
//		x = x-y;
//		
		//3.using multiplication
		
//		x = x*y;
//		y = x/y;
//		x = x/y;
		
		//4. using XOR operator
		
		x = x^y;
		y = x^y;
		x = x^y;
		
		System.out.println("After swapping ");
		System.out.println("value of x is :" + x);
		System.out.println("value of y is :" + y);
		
		
	}

}
