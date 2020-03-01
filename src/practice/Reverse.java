package practice;

public class Reverse {

	public static void main(String[] args) {

		String S = "Hello World";
		String rev = "";
		int len = S.length();
	// using for loop
		
		  for (int i =len-1;i>=0;i--)
		  { 
			  rev = rev + S.charAt(i);
		  }
		  System.out.println(rev);
		  
	 //using string buffer 
		  StringBuffer SB = new StringBuffer(S);
		  System.out.println(SB.reverse());
		 
		
		/*
		 * // using for loop 
		 * for (int i = 0;i<=len-1;i++) 
		 * { 
		 * rev = rev + S.charAt(i);
		 * 
		 * System.out.println(rev);
		 * 
		 * } 
		 * //System.out.println(rev);
		 */
		
		
		
		
	}

}
