package com.github.dshah94;

import com.github.dshah94.domain.Ingredient;
import java.util.*;
import java.util.stream.Collectors;

public class EntryPointMap {

	public static void main(String[] args) {
		System.out.println("This is a map of my ingredients");

		// Creating instances of the Ingredient class
		Ingredient tomato = new Ingredient("Tomato", 3.0, "g");
		Ingredient onion = new Ingredient("Onion", 4.0, "g");
		Ingredient salt = new Ingredient("Salt", 1000, "g");
		Ingredient sugar = new Ingredient("Sugar", 2000, "g");
		Ingredient apple = new Ingredient("Apple", 10, "kg");
		Ingredient saffron = new Ingredient("Saffron", 500, "g");

		// Create a map to store Ingredient objects with names as keys
		Map<String, Ingredient> ingredientsMap = new HashMap<>();

		// Adding Ingredient objects to the map with names as keys
		ingredientsMap.put(tomato.getName(), tomato);
		ingredientsMap.put(onion.getName(), onion);
		ingredientsMap.put(salt.getName(), salt);
		ingredientsMap.put(sugar.getName(), sugar);
		ingredientsMap.put(apple.getName(), apple);
		ingredientsMap.put(saffron.getName(), saffron);

		// Sort the map by ingredient names
		List<Map.Entry<String, Ingredient>> sortedList = new ArrayList<>(ingredientsMap.entrySet());
		sortedList.sort(Map.Entry.comparingByKey());

		// Creating a sorted map
		Map<String, Ingredient> sortedIngredientsMap = new LinkedHashMap<>();
		for (Map.Entry<String, Ingredient> entry : sortedList) {
			sortedIngredientsMap.put(entry.getKey(), entry.getValue());
		}

		// Print the sorted map
		System.out.println("Sorted Ingredients Map: " + sortedIngredientsMap);
	}
}
