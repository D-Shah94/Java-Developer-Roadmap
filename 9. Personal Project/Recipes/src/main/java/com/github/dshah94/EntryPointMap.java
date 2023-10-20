package com.github.dshah94; // Declares the package to which this class belongs.

import com.github.dshah94.domain.Ingredient; // Importing the Ingredient class from a different package.
import java.util.*; // Importing various classes and interfaces from the java.util package.
// import java.util.stream.Collectors; // Importing the Collectors class for working with streams.

public class EntryPointMap {

	public static void main(String[] args) { // Main method, the entry point for the program.
		System.out.println("This is a map of my ingredients"); // Printing a message to the console.

		// Creating instances of the Ingredient class
		Ingredient tomato = new Ingredient("Tomato", 3.0, "g"); // Creating an Ingredient object with name, quantity, and unit.		Ingredient onion = new Ingredient("Onion", 4.0, "g");
		Ingredient salt = new Ingredient("Salt", 1000, "g");
		Ingredient sugar = new Ingredient("Sugar", 2000, "g");
		Ingredient apple = new Ingredient("Apple", 10, "kg");
		Ingredient saffron = new Ingredient("Saffron", 500, "g");
		Ingredient onion = new Ingredient("Onion", 5, "g");


		// Create a map to store Ingredient objects with names as keys
		Map<String, Ingredient> ingredientsMap = new HashMap<>(); // Creating a map to store Ingredient objects with names as keys.

		// Adding Ingredient objects to the map with names as keys
		ingredientsMap.put(tomato.getName(), tomato); // Adding an Ingredient object to the map with the name as the key.
		ingredientsMap.put(onion.getName(), onion);
		ingredientsMap.put(salt.getName(), salt);
		ingredientsMap.put(sugar.getName(), sugar);
		ingredientsMap.put(apple.getName(), apple);
		ingredientsMap.put(saffron.getName(), saffron);

		// Sort the map by ingredient names
		List<Map.Entry<String, Ingredient>> sortedList = new ArrayList<>(ingredientsMap.entrySet()); // Creating a list from map entries.
		sortedList.sort(Map.Entry.comparingByKey()); // Sorting the list of map entries by keys (ingredient names).

		// Creating a sorted map
		Map<String, Ingredient> sortedIngredientsMap = new LinkedHashMap<>(); // Creating a new map to store sorted entries.
		for (Map.Entry<String, Ingredient> entry : sortedList) { // Iterating through the sorted list of entries.
			sortedIngredientsMap.put(entry.getKey(), entry.getValue()); // Adding sorted entries to the new map.
		}

		// Print the sorted map
		System.out.println("Sorted Ingredients Map: " + sortedIngredientsMap); // Printing the sorted map.
	}
}
