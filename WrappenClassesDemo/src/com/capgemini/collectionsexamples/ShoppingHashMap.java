
/*create a hashmap to store shopping list  with id and nameofitem
and perform
create
read the keyset
read the values
read the entryset
replace
sort the values using treemap*/

package com.capgemini.collectionsexamples;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ShoppingHashMap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> shoppingList = new HashMap<Integer,String>();

		shoppingList.put(12, "Apples");
		shoppingList.put(2, "Flour");
		shoppingList.put(3, "pulses");
		shoppingList.put(4, "oil");

		System.out.println("HashMap values=" + shoppingList);
		// set of keys from the above HashMap
		Set<Integer> shoppingListKeySet = shoppingList.keySet();
		System.out.println("key values of above HashMap=" + shoppingListKeySet);

		// set of values from the above HashMap
		Collection<String> shoppingListValueSet = shoppingList.values();
		System.out.println("values if above HashMap =" + shoppingListValueSet);

		// keys,values from above HashMap using entryset()
		Set<Entry<Integer,String>> shoppingListKeyValueSet = shoppingList.entrySet();
		System.out.println("key and value from above HashMap=" + shoppingListKeyValueSet);

		// replace a HashMap value
		shoppingList.replace(2,"salt");

		// keys,values from above HashMap using entryset()
		Set<Entry<Integer,String>> newshoppingListKeyValueSet = shoppingList.entrySet();
		System.out.println("key and value from above HashMap after remove of key=" + newshoppingListKeyValueSet);

		// ilterate through a HashMap
		// iterating through the keyset using keyset() method
		System.out.println("keys=");
		for (Integer key : shoppingList.keySet()) {
			System.out.println(key);
			System.out.println(",");
			System.out.println();

			// ilterate through a HashMap
			// iterating through the values using values() method
			System.out.println("values=");
			for (String values : shoppingList.values()) {
				System.out.println(values);
				System.out.println(",");
				System.out.println();
			}
			System.out.println("values using set=");
			for (String values : shoppingListValueSet) {
				System.out.println(values);
				System.out.println(",");
			}

			// ilterate through a HashMap
			// iterating through the values using entrySet() method
			System.out.println("keys,values using entrySet=");
			for (Entry<Integer,String> hasmapdata : shoppingList.entrySet()) {
				System.out.println(hasmapdata);
				System.out.println(",");
				System.out.println();
			}
			System.out.println("values using set=");
			for (Entry<Integer,String> hasmapdata : shoppingListKeyValueSet) {
				System.out.println(hasmapdata);
				System.out.println(",");
			}

			// converting HashMap to TreeMap to sort the values
			Map<Integer,String> shoppingListSorted = new TreeMap<Integer,String>();
			shoppingListSorted.putAll(shoppingList);
			System.out.println("sorted data=" + shoppingListSorted);
		}

	}
}
