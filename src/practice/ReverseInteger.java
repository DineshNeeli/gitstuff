package practice;

public class ReverseInteger {

	public static void main(String[] args) {

		int num = 123456;
		int rev = 0;

		// USing algorithm	
		while(num != 0)
		{
			rev= rev * 10 + num % 10;
			num = num / 10;
		} 
		System.out.println(rev);

		//Using string buffer

		int num1 = 123456;


		StringBuffer sb = new StringBuffer(String.valueOf(num1)).reverse();
		System.out.println(sb);

		//********************************************************************************************************
		//Practice sample**************

		int num2 = 123456;
		String rev2 = "";

		StringBuffer sb1 = new StringBuffer(String.valueOf(num2));
		// System.out.println(sb1);

		int len  = sb1.length();
		for (int i=0;i<=len-1;i++) 
		{
			rev2 = rev2 + sb1.charAt(i);
			System.out.println(rev2);
		}
		System.out.println(rev2);







	}

}
