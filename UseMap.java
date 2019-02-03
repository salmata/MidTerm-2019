package datastructure;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/**
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[ MySql] to store data and retrieve data.
		 */

		HashMap <Integer,String > Hmap = new HashMap< Integer, String>();

		Hmap.put(1,"Mozammal");
		Hmap.put(2,"Abdel");
		Hmap.put(3,"Salma");
		Hmap.put(4,"Jahid");
		Hmap.put(5,"Alma");

		//Retrieve
		String sr = Hmap.get(3);
		System.out.println(" Value at index 3 is :" + sr);

		Map<String, List<String>>listMap = new HashMap<>();
		List<String>list = new ArrayList<>();
		list.add("Toyota");
		list.add("BMW");
		list.add("Mersedise");
		list.add("Ford");
		list.add("Honda");

		System.out.println(list);

		//for (String str: list.get(){
			//System.out.println();


		}
			 {

		}



		}







