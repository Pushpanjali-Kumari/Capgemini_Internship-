package com.capgemini.collectionsexamples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> languages = new HashMap<String, Integer>();
		// add elements to hashmap
		languages.put("Java", 17);
		languages.put("Java", 8);// collision
		languages.put("C", 11);
		languages.put("C++", 10);
		languages.put("JavaScript", 6);
		languages.put("Python", 3);
		System.out.println("HashMap values=" + languages);

		// get() method for accessing value
		int value = languages.get("Java");
		System.out.println("Value in hashMap with key 'java'=" + value);

		// set of keys from the above HashMap
		Set<String> languagesKeySet = languages.keySet();
		System.out.println("key values of above HashMap=" + languagesKeySet);

		// set of values from the above HashMap
		Collection<Integer> languagesValueSet = languages.values();
		System.out.println("values if above HashMap =" + languagesValueSet);

		// keys,values from above HashMap using entryset()
		Set<Entry<String, Integer>> languagesKeyValueSet = languages.entrySet();
		System.out.println("key and value from above HashMap=" + languagesKeyValueSet);

		// replace a HashMap value
		languages.replace("Java", 9);

		// keys,values from above HashMap using entryset()
		Set<Entry<String, Integer>> newlanguagesKeyValueSet = languages.entrySet();
		System.out.println("key and value from above HashMap after remove of key=" + newlanguagesKeyValueSet);

		// ilterate through a HashMap
		// iterating through the keyset using keyset() method
		System.out.println("keys=");
		for (String key : languages.keySet()) {
			System.out.println(key);
			System.out.println(",");
			System.out.println();

			// ilterate through a HashMap
			// iterating through the values using values() method
			System.out.println("values=");
			for (Integer values : languages.values()) {
				System.out.println(values);
				System.out.println(",");
				System.out.println();
			}
			System.out.println("values using set=");
			for (Integer values : languagesValueSet) {
				System.out.println(values);
				System.out.println(",");
			}

			// ilterate through a HashMap
			// iterating through the values using entrySet() method
			System.out.println("keys,values using entrySet=");
			for (Entry<String, Integer> hasmapdata : languages.entrySet()) {
				System.out.println(hasmapdata);
				System.out.println(",");
				System.out.println();
			}
			System.out.println("values using set=");
			for (Entry<String, Integer> hasmapdata : languagesKeyValueSet) {
				System.out.println(hasmapdata);
				System.out.println(",");
			}
			
			//converting HashMap to TreeMap to sort the values
			Map<String, Integer> languagesSorted = new TreeMap<String, Integer>();
			languagesSorted .putAll(languages);
			System.out.println("sorted data="+languagesSorted );
		}
	}

}
