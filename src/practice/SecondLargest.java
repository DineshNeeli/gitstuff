package practice;

public class SecondLargest {

	public static void main(String[] args) 
	{
		int a[]= {1,5,5,2,-10,80,56,-63};
		int Largest = Integer.MIN_VALUE;
		int Second_Largest = Integer.MIN_VALUE;
		
		for(int i =0 ; i<a.length;i++)
		{
			if(a[i]>Largest)
			{
				Second_Largest = Largest;
				Largest = a[i];
			}else if(a[i]>Second_Largest && a[i] != Largest)
			{
				Second_Largest = a[i];
			}
			
		}
		System.out.println(Second_Largest);		
	}

}
