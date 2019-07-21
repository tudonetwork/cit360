package main;

import java.util.*;

/* @descrip: Java Collection
 * @author: Ramon Andrade 2019
 * 
 */

// list - ok, set - ok, map - ok, queue- ok, tree- ok

public class Collections1 {

	public static void main(String args[]) {
		
		int totalchap;
		String bookname;
				
				
		/*
		 * LIST creating array list
		 * 
		 */
		
		System.out.println("\n ************ LIST ************ ");

		System.out.println("--- ArrayList ");
		
		ArrayList<String> al = new ArrayList<String>();
		
		// Adding elements
		bookname = "1 Nephi";
		totalchap = 20;
		
		for(var i = 1; i <= totalchap; i++) {
			al.add(bookname + " " + i);
		}
		
		System.out.println("- "+ bookname);

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Is empty? " + al.isEmpty());
		System.out.println("Size: " + al.size());
		System.out.println("\n\n");

		
		/*
		 * LIST
		 * linked list
		 * 
		 */
		System.out.println("- LinkedList ");
		LinkedList<String> al2 = new LinkedList<String>();

		// Adding elements
		bookname = "2 Nephi";
		totalchap = 33;
		
		for(var i = 1; i <= totalchap; i++) {
			al2.add(bookname + " " + i);
		}
		
		System.out.println("- "+ bookname);

		Iterator<String> itr2 = al2.iterator();

		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.out.println("Is empty? " + al2.isEmpty());
		System.out.println("Size: " + al2.size());
		System.out.println("\n\n");

		
		
		
		
		
		/*
		 * QUEUE creating priority queue
		 * 
		 */
		
		System.out.println("\n ************ QUEUE ************ ");

		System.out.println("- PriorityQueue ");

		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		// Adding elements
		bookname = "Jacob";
		totalchap = 7;
		
		for(var i = 1; i <= totalchap; i++) {
			queue.add(bookname + " " + i);
		}
		
		System.out.println("- "+ bookname);

		System.out.println("head (Element):" + queue.element());
		System.out.println("head (Peek):" + queue.peek());

		Iterator<String> itrQ3 = queue.iterator();

		while (itrQ3.hasNext()) {
			System.out.println(itrQ3.next());
		}

		queue.remove();
		queue.poll();

		System.out.println("* after removing elements:");

		Iterator<String> itrQ4 = queue.iterator();

		while (itrQ4.hasNext()) {
			System.out.println(itrQ4.next());
		}
	
		System.out.println("Is empty? " + queue.isEmpty());
		System.out.println("Size: " + queue.size());
		System.out.println("\n\n");

		
		
		/*
		 * SET
		 * 
		 * creating hashSet
		 */

		System.out.println("\n ************ SET ************ ");

		System.out.println("- HashSet ");

		HashSet<String> alS = new HashSet<String>();

		// Adding elements
		bookname = "Mosiah";
		totalchap = 29;
		
		for(var i = 1; i <= totalchap; i++) {
			alS.add(bookname + " " + i);
		}
		
		System.out.println("- "+ bookname);
		
		Iterator<String> itrS = alS.iterator();
		while (itrS.hasNext()) {
			System.out.println(itrS.next());
		}
		
		// Removing all 
		alS.removeAll(alS); 
        System.out.println("HashSet afterremoveAll()"); 
        

		System.out.println("Is empty? " + alS.isEmpty());
		System.out.println("Size: " + alS.size());
		System.out.println("\n\n");

		/*
		 * SET
		 * 
		 * LINKED hashSet
		 */

		System.out.println("- LinkedHashSet ");

		LinkedHashSet<String> lhs = new LinkedHashSet<String>();

		// Adding elements
		bookname = "Alma";
		totalchap = 63;
		
		for(var i = 1; i <= totalchap; i++) {
			lhs.add(bookname + " " + i);
		}
		
		System.out.println("- "+ bookname);

		Iterator<String> lhsI = lhs.iterator();
		while (lhsI.hasNext()) {
			System.out.println(lhsI.next());
		}

		System.out.println("Is empty? " + lhs.isEmpty());
		System.out.println("Size: " + lhs.size());
		System.out.println("\n\n");

		/*
		 * SET
		 * 
		 * TreeSet
		 */

		System.out.println("- TreeSet ");

		TreeSet<String> alT = new TreeSet<String>();

		// Adding elements
		bookname = "Helaman";
		totalchap = 16;
		
		for(var i = 1; i <= totalchap; i++) {
			alT.add(bookname + " " + i);
		}
		
		System.out.println("- "+ bookname);

		Iterator<String> itrT = alT.iterator();
		while (itrT.hasNext()) {
			System.out.println(itrT.next());
		}

		System.out.println("Is empty? " + alT.isEmpty());
		System.out.println("Size: " + alT.size());
		System.out.println("\n\n");

		
		
		
		/*
		 * TREE
		 * 
		 * creating HashMap
		 */

		System.out.println("\n ************ TREE ************ ");

		System.out.println("- TreeSet ");

		TreeSet<String> ts1 = new TreeSet<String>();

		// Adding elements
		bookname = "Moroni";
		totalchap = 10;
		
		for(var i = 1; i <= totalchap; i++) {
			ts1.add(bookname + " " + i);
		}
		
		System.out.println("- "+ bookname);

		// Duplicates will not get insert
		ts1.add("Moroni 10");

		// Sorting Order(Ascending) 
		Iterator<String> itrS2 = ts1.iterator();
		while (itrS2.hasNext()) {
			System.out.println(itrS2.next());
		}
		
		System.out.println("Is empty? " + ts1.isEmpty());
		System.out.println("Size: " + ts1.size());
		System.out.println("\n\n");
		

		
		/*
		 * MAP
		 * 
		 * HashMap
		 */

		System.out.println("\n ************ MAP ************ ");

		System.out.println("- HashMap ");

		Map<String, String> map1 = new HashMap<String, String>();
		
		map1.put("England", "London");
		map1.put("Germany", "Berlin");
		map1.put("Norway", "Oslo");
		map1.put("USA", "Washington DC");
		map1.put("España", "Madrid");
		
		for (String i : map1.keySet()) {
		  System.out.println("The Capital of " + i + " is " + map1.get(i));
		}

		System.out.println("Is empty? " + map1.isEmpty());
		System.out.println("Size: " + map1.size());
		System.out.println("\n\n");
		
		
		/*
		 * MAP
		 * 
		 * TreeMap
		 */
		System.out.println("- TreeMap ");

		Map<String, String> mapT = new TreeMap<String, String>();
		mapT.putAll(map1);
		
		System.out.println("* removing two capitals");
		mapT.remove("Norway");
		mapT.remove("England");

		for (String v : mapT.keySet()) {
			 System.out.println("The Capital of " + v + " is " + mapT.get(v));
		}
		
		System.out.println("Is empty? " + mapT.isEmpty());
		System.out.println("Size: " + mapT.size());
		System.out.println("\n\n");
		


	}

}
