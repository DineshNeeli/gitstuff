package practice;

import java.util.Arrays;

public class LargestandSmallest {

	public static void main(String[] args) {

		int numbers[] = {66543,50,90,-88,-10};
		int largest= numbers[0];
		int smallest=numbers[0];
	//	int secondlargest = numbers[0];

		for(int i = 1; i<numbers.length;i++)
		{
			if(numbers[i]>numbers[0])
			{
				largest=numbers[i]; // 66534
				
			}else if(numbers[i]<numbers[0]) //50
			{ 
				smallest=numbers[i];
			} 
		}
		System.out.println("Given array list is ::" + Arrays.toString(numbers));

		System.out.println("Largest number is ::" + largest);

		System.out.println("Smallest number is ::" + smallest);

		// System.out.println("second largest number is ::" + secondlargest);

	}

}
