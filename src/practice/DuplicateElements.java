package practice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {

		String names = "Java Ruby C Javascript Python Java C";
		// 1. using for loops
//		for(int i=0;i<names.length;i++) {
//			for(int j = i+1;j<names.length;j++)
//			{
//				if(names[i].equals(names[j]))
//				{
//					System.out.println("Duplicate Element is ::: " + names[i]);
//				}					
//			}
//						
//		}
		//using hashset
		String words[] =  names.split(" ");
		
		
		Set<String> store = new HashSet<String>();
		for(String name : words) {
			if(store.add(name)==false)
			{
				System.out.println("Duplicate Element is ::: " + name);
			}
		}
		
		
		
	}

}
