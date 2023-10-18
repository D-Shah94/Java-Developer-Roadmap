package com.github.dshah94;

import com.github.dshah94.domain.Ingredient;

import java.util.*;

public class EntryPointSet {

	public static void main(String[] args) {
		System.out.println("This is a set of my ingredients");

		// Creating instances of the Ingredient class
		Ingredient tomato = new Ingredient("Tomato", 3.0, "g");
		Ingredient onion = new Ingredient("Onion", 4.0, "g");
		Ingredient salt = new Ingredient("Salt", 1000, "g");
		Ingredient sugar = new Ingredient("Sugar", 2000, "g");
		Ingredient apple = new Ingredient("Apple", 10, "kg");
		Ingredient saffron = new Ingredient("Saffron", 500, "g");

		// Create a set to store Ingredient objects
		Set<Ingredient> ingredientsSet = new HashSet<>();

		// Adding Ingredient objects to the set
		ingredientsSet.add(tomato);
		ingredientsSet.add(onion);
		ingredientsSet.add(salt);
		ingredientsSet.add(sugar);
		ingredientsSet.add(apple);
		ingredientsSet.add(saffron);

		// Sort the list alphabetically
		List<Ingredient> sortedIngredientsList = new ArrayList<>(ingredientsSet);
		Collections.sort(sortedIngredientsList);

		// Print the sorted list
		System.out.println(sortedIngredientsList);
	}
}
