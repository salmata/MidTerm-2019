package datastructure;

import jdk.jfr.events.FileReadEvent;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.Stack;

public class DataReader {


	public static void main(String args[]) throws Exception {
		/**
		 * Use API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */


		String textFile = System.getProperty("user.dir") + "//Users/salmasultana/Documents/MidTermJan2019/src/main/java/data/testData.xlsx";
		FileReader fr = null;
		BufferedReader br = null;
		FileReader fileReader = new FileReader("/Users/salmasultana/Documents/MidTermJan2019/src/main/java/data/testData.xlsx");
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		try {
			fr = new FileReader(textFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		br = new BufferedReader(fr);
		System.out.println(" Retrieve data using for loop");
		for (String st: textFile()) {
			System.out.println(st);
			int i;
			String  sr;
			while ((i  =br.read())!=-1){
				System.out.println(st); int i1 = i;

			}
			br.close();
			fileReader.close();
		}
	}
	private static Iterable<? extends String> textFile() {
		return null;
	}
}