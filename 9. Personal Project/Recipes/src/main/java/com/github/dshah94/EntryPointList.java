package com.github.dshah94;

import com.github.dshah94.domain.Ingredient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EntryPointList {

	public static void main(String[] args) {
		System.out.println("This is a list of my ingredients");

		// Creating instances of the Ingredient class
		Ingredient tomato = new Ingredient("Tomato", 3.0, "g");
		Ingredient onion = new Ingredient("Onion", 4.0, "g");
		Ingredient salt = new Ingredient("Salt", 1000, "g");
		Ingredient sugar = new Ingredient("Sugar", 2000, "g");
		Ingredient apple = new Ingredient("Apple", 10, "kg");
		Ingredient saffron = new Ingredient("Saffron", 500, "g");

		// Create a list to store Ingredient objects
		List<Ingredient> ingredients = new ArrayList<>();

		// Adding Ingredient objects to the list
		ingredients.add(tomato);
		ingredients.add(onion);
		ingredients.add(salt);
		ingredients.add(sugar);
		ingredients.add(apple);
		ingredients.add(saffron);

		// Print the list of ingredients
		System.out.println(ingredients);

		// Using the toString method to convert an ingredient to a string
		String tomatoString = tomato.toString();
		System.out.println(tomatoString);

		// Sort the list alphabetically - Demonstrating sorting of objects
		Collections.sort(ingredients);

		// Now, the ingredients list is sorted alphabetically
		System.out.println(ingredients);

		// Get the number of items in the list - Illustrating list size
		System.out.println("The number of items in this list is " + ingredients.size());

		// Count and print ingredients that start with 'S' - Basic iteration
		int count = 0;
		for (Ingredient ingredient : ingredients) {
			if (ingredient.getName().startsWith("S")) {
				count++;
				System.out.println(ingredient);
			}
		}
		System.out.println("Count of ingredients starting with 'S': " + count);
	}
}
