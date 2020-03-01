package practice;

public class FunctionsInJava {

	public static void main(String args[])
	{
		FunctionsInJava obj = new FunctionsInJava();
		// here one obj will be created , obj is the reference ,referring to this object
		// after creating and object the copy of all non static methods in the class will be given to this object.
		
		obj.test();
		
		int l = obj.pqr();
		System.out.println(l);
		
		String s1 = obj.qa();
		System.out.println(s1);
	
		int div =obj.division(30,10);
		System.out.println(div);
		
		// main method is void--never returns any value 
	
	}


	// non static methods
	// void --> Does not return any value
	// return type --> void
	// no input, no output
	
	public void test()
	{
		System.out.println("TEST METHOD");
	}

	// return type --> Integer
	//no input, some output
	public int pqr()
	{
		int a= 10;
		int b=20;
		int c= a+b;
		System.out.println("PQR METHOD" + c);
		return c;
	}

	// return type --> String 
	// no input , some output
	public String qa()
	{
		String s= "Selenium" ;
		System.out.println("QA METHOD " + s);
		return s;
	}

	// return type --> Integer
	// x,y --> input parameters/ arguments 
	// with input and output

	public int division(int x, int y)
	{
		System.out.println("DIVISION METHOd");
		int d= x/y;
		return d;
	}


}
