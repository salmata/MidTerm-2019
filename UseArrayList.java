package datastructure;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/**
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 */
 int x= 4;
 Integer y = 4;
// Integer Declaration by adding
 ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(1);
		ar.add(25);
		ar.add(35);
		ar.add(75);
		ar.add(99);
		System.out.println(" Elements of ArrayList of Integer Type: " + ar);
		System.out.println(" Peek first element:"+ ar.get(0));
		System.out.println(" Remove element at idex 1: "+ ar.remove(1));
		System.out.println(" Retrieved element is : = "+ ar);

		System.out.println(" Iterating by for each loop ");
		for (Integer in:ar) {
			System.out.println(in);

		}
		Iterator it = ar.iterator();
		while (it.hasNext()){
			Integer i = (Integer) it.next();
			System.out.println(i);
		}

		}





}
