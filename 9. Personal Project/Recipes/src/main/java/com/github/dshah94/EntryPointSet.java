package com.github.dshah94;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class EntryPointSet {
	public static void main(String[] args) {
		System.out.println("This is a list of my ingredients");

		//Sets

		//A Set is an unordered collection of unique elements.
		Set<String> ingredients = new HashSet<>();
		ingredients.add("Chilli Powder");
		ingredients.add("Pepper");
		ingredients.add("Oregano");
		ingredients.add("Kimchi");
		// Won't be added again (no duplicates allowed)
		ingredients.add("Pepper");
		ingredients.add("Plum");


		// Convert the Set to a List
		List<String> sortedIngredientsList= new ArrayList<>(ingredients);

		// Sort the List alphabetically
		Collections.sort(sortedIngredientsList);

		System.out.println("Sorted Ingredients: " + sortedIngredientsList);


		System.out.println("The number of items in this set is " + ingredients.size());

		int count = 0;
		for (String ingredient: ingredients) {
			if (ingredient.contains("P")) {
				count++;
				System.out.println(ingredient);
			}
		}
		System.out.println(count);

	}

}
