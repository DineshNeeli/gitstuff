package practice;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args)
	{

		LinkedList<String>ll = new LinkedList<String>();

		// Adding values into linked list 
		
		System.out.println("******ADDING VALUES INTO LINKED LIST******");

		ll.add("Deloite");
		ll.add("Microsoft");
		ll.add("Google");
		ll.add("Amazon");
		ll.add("Accenture");
		ll.add("IBM");
		ll.add("United Health Group");
		ll.add("Oracle");

		System.out.println("lIST OF COMPANIES IN THE LINKED LIST"+ll);

		//Add a value at the first of the linked list 

		System.out.println("****** ADDING FIRST VALUES INTO LINKED LIST ******");

		ll.addFirst("Infosys");

		System.out.println("lIST OF COMPANIES IN THE LINKED LIST: 	"+ll);

		//Add a value at the last of the linked list 

		System.out.println("****** ADDING LAST VALUES INTO LINKED LIST ******");

		ll.addLast("BMW");

		System.out.println("lIST OF COMPANIES IN THE LINKED LIST: "+ll);

		// get the value at the particular index

		System.out.println("****** GET THE VALUE FOR AN INDEX ******");

		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		System.out.println(ll.get(2));
		System.out.println(ll.get(3));
		System.out.println(ll.get(4));
		System.out.println(ll.get(5));

		// Set the value for the particular index
		System.out.println("****** SET THE VALUE FOR AN INDEX ******");


		ll.set(0, "AUDI");
		System.out.println(ll.get(0));

		ll.set(1,"BENZ");
		System.out.println(ll.get(1));

		ll.set(2, "BMW");
		System.out.println(ll.get(2));

		ll.set(3, "FERARI");
		System.out.println(ll.get(3));

		ll.set(4,"JAGUAR");
		System.out.println(ll.get(4));

		//print my linked list after modification

		System.out.println("****** PRINT MY MODIFIED LINKED LIST ******");
		System.out.println(ll);

		//remove an element 

		System.out.println("****** REMOVE AN ELEMENT FROM LINKED LIST ******");

		ll.removeLast();

		System.out.println(ll);

		ll.removeFirst();

		System.out.println(ll);

		ll.remove(7);

		System.out.println(ll);

		// Get all the elements in linked list  

		System.out.println("***** USING FOR LOOP ******");

		for (int n=0; n<ll.size();n++)
		{
			System.out.println(ll.get(n));	
		}

		System.out.println("****** USING ADVANCED FOR LOOP ******");

		for(String data : ll) 
		{
			System.out.println(data);	
		}

		System.out.println("****** USING ITERATOR ******");
		// while loop should be use for ITERATOR 

		Iterator<String> it = ll.iterator();		
		while(it.hasNext()) 
		{
			System.out.println(it.next());	
		}

		System.out.println("****** USING WHILE LOOP ******");

		int num =0;

		while(num<ll.size())
		{
			System.out.println(ll.get(num));
			num++;
		}

	}

}
