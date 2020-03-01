package practice;

public class swappingStrings {

	public static void main(String[] args) {

		String a = "Dinesh";
		String b = "Neeli";
		
		System.out.println("Befor swapping ");
		System.out.println(a);
		System.out.println(b);
		
		//1. append both values 
		
		a= a+b;
		
		b= a.substring(0,a.length()-b.length());
		
		a= a.substring(b.length());
		
		System.out.println("After swapping");
		
		System.out.println(a);
		System.out.println(b);
		
		
		
		
		
		
		
	}

}
