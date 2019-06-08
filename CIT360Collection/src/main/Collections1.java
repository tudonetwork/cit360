package main;

import java.util.ArrayList;
import java.util.Iterator;

/* @descrip: Class to use Java Collection
 * @author: Ramon Andrade 2019
 * 
 */

public class Collections1 {
	
	public static void main(String args[]){  

		// Java Collections list
		
		System.out.println("--- The Collection Interfaces");  
		System.out.println("--- The Collection Classes");  
		System.out.println("--- The Collection Algorithms");  
		
		
		ArrayList<String> list = new ArrayList<String>(); //Creating arraylist  
		
		list.add("List Interface");
		list.add("Set");
		list.add("SortedSet");
		list.add("Map");
		list.add("Map.Entry");
		list.add("SortedMap");
		list.add("Enumeration");								
		list.add("AbstractCollection");
		list.add("AbstractList");
		list.add("AbstractSequentialList");
		list.add("LinkedList");
		list.add("ArrayList");
		list.add("AbstractSet");
		list.add("HashSet");
		list.add("LinkedHashSet");
		list.add("TreeSet");
		list.add("AbstractMap");
		list.add("HashMap");
		list.add("TreeMap");
		list.add("WeakHashMap");
		list.add("LinkedHashMap");
		list.add("IdentityHashMap");
		list.add("Vector");
		list.add("Stack");
		list.add("Dictionary");
		list.add("Hashtable");
		list.add("Properties");
		list.add("BitSet");

		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
			System.out.println("- " + itr.next());  
		}
		
	} 

}
