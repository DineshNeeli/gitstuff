package practice;

public class MethodOverLoading 
{
	//HERE SUM METHOD IS OVER LOADED i.e SAME METHOD WITH DIFFERNT INPUT PARAMETERS OR ARGUMENTS & DIFFERENT DATA TYPE
	//DUPLICATE METHOD CANNOT BE CREATED i.e SAME METHOD NAME WITH SAME ARGUMENTS OR PARAMETERS
	//YOU CANNOT CREATE MULTIPLE METHODS IN SINGLE METHOD
	//WE CAN EVEN OVERLOAD MAIN METHOD ALSO

	public void sum() // NO ARGUMENTS
	{
		System.out.println("SUM METHOD --> NO ARGUMRNTS");
	}

	public void sum(int i) //ONE ARGUMENT WITH SAME METHOD NAME
	{
		System.out.println("SUM METHOD --> ONE ARGUMENT");
		System.out.println(i);
	}

	public void sum(int x, int y) //TWO ARGUMENTS WITH SAME METHOD NAME
	{
		System.out.println("SUM METHOD --> TWO ARGUMENTS");
		System.out.println(x+y);
	}


	public static void main(String[] args) 
	{
		MethodOverLoading OBJ = new MethodOverLoading();
		OBJ.sum();
		OBJ.sum(10);
		OBJ.sum(10,5);
	}

	public static void main() //EXAMPLE 
	{
		MethodOverLoading OBJ = new MethodOverLoading();
		OBJ.sum();
		OBJ.sum(10);
		OBJ.sum(10,5);
	}
	public static void main(int i) //EXAMPLE
	{
		MethodOverLoading OBJ = new MethodOverLoading();
		OBJ.sum();
		OBJ.sum(10);
		OBJ.sum(10,5);
	}

}
