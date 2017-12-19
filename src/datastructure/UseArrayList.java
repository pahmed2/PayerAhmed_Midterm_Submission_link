package datastructure;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */


		ArrayList<String> ItemList = new ArrayList<>();

		ItemList.add("Rice");
		ItemList.add("onions");
		ItemList.add("Fish");
		ItemList.add("Garlic");
		ItemList.add("checken");
		ItemList.add("Beef");
		ItemList.add("Milk");

		int numOfGroceries = ItemList.size();

		ItemList.remove("Milk");

		//boolean containsGarlic = groceries.contains("Garlic");

		//Coonecting to Database
		ConnectDB connectDB = new ConnectDB();
		connectDB.InsertDataFromArrayListToMySql(ItemList, "list", "Name");
		//connectDB.readDataBase("list", "Name");


	    //Using Iterator
		Iterator it = ItemList.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		for(String st : ItemList);
		System.out.println(ItemList);

	}

}
