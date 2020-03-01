package practice;

public class StaticAndNonStatic 
{

	//Global variables 

	String name ="Dinesh";  //--> Non static variable
	static int age = 28;    //--> Static variable

	public static void main(String[] args)
	{

		//how to call a static methods 
		//1. directly 
		sum();
		//2. by class name
		StaticAndNonStatic.sum();

		//how to call a static variables

		System.out.println(age); //directly
		System.out.println(StaticAndNonStatic.age); // by class name

		// how to call a non static methods and variables 
		// by creating a reference object to the class name 

		StaticAndNonStatic obj = new StaticAndNonStatic();
		System.out.println(obj.name); //calling a non static variable
		obj.sendmail();// calling a non static method

		// can we call a static method using obj reference?
		// we can call , but it will throw a warning saying that static methods should be called in static ways

		obj.sum();		

	}

	// Creating a non static method
	public void sendmail()
	{
		System.out.println("send email");
	}
	// creating a static method

	public static void sum()
	{
		System.out.println("sum method");
	}
}
