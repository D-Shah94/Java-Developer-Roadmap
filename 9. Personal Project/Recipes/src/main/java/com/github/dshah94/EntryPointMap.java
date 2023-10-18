package com.github.dshah94;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Collections;


public class EntryPointMap {
	public static void main(String[] args) {
		System.out.println("This is a list of my ingredients");

		//Maps
		//A Map is a collection of key-value pairs, where each key is unique.
		Map<Integer, String> ingredients = new HashMap<>();
		ingredients.put(1, "Tofu");
		ingredients.put(2, "Tangerine");
		ingredients.put(3, "Orange");
		ingredients.put(4, "Apple");
		ingredients.put(4, "Test");

		// Convert Map to a List
		List<String> sortedIngredientsMap = new ArrayList<>();


		// Sort alphabetically
		Collections.sort(sortedIngredientsMap);

		// Print sorted list

		System.out.println(sortedIngredientsMap);

		System.out.println("The number of items in this set is " + ingredients.size());
		System.out.println("Checking the value of key:3 gives me " + ingredients.get(3));
		System.out.println("This is a test to see if the value for key 4 has been overwritten " + ingredients.get(4)); //new key-value pair was set


		//looping through a map


	}

}
