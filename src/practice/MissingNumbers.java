package practice;

public class MissingNumbers {

	public static void main(String[] args) {

		//int a[]= {1,2,3,4,6};
		//sum = 1+2+3+4+6
		//sum1 = 1+2+3+4+5+6
		//sum1-sum
		
		
		int a[] = {-2,-1,0,1,2,3,4,5};
		int sum = 0;
		int sum1 = 0;
		
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i]; 
		}
		System.out.println(sum);
		
		for(int j=-2 ;j<=6;j++)
		{
			sum1 = sum1 + j;
		}
		System.out.println(sum1);
		
		System.out.println("Missing Number Is :::: " + (sum1-sum));
		
		
		
		
		
		
	}

}
