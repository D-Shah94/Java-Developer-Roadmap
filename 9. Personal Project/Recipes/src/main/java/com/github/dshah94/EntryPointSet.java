package com.github.dshah94; // Declares the package to which this class belongs.

import com.github.dshah94.domain.Ingredient; // Importing the Ingredient class from a different package.
import java.util.*; // Importing various classes and interfaces from the java.util package.

public class EntryPointSet {

	public static void main(String[] args) { // Main method, the entry point for the program.
		System.out.println("This is a set of my ingredients"); // Printing a message to the console.

		// Creating instances of the Ingredient class
		Ingredient tomato = new Ingredient("Tomato", 3.0, "g"); // Creating an Ingredient object with name, quantity, and unit.
		Ingredient onion = new Ingredient("Onion", 4.0, "g");
		Ingredient salt = new Ingredient("Salt", 1000, "g");
		Ingredient sugar = new Ingredient("Sugar", 2000, "g");
		Ingredient apple = new Ingredient("Apple", 10, "kg");
		Ingredient saffron = new Ingredient("Saffron", 500, "g");

		// Create a set to store Ingredient objects
		Set<Ingredient> ingredientsSet = new HashSet<>(); // Creating a set to store Ingredient objects.

		// Adding Ingredient objects to the set
		ingredientsSet.add(tomato); // Adding an Ingredient object to the set.
		ingredientsSet.add(onion);
		ingredientsSet.add(salt);
		ingredientsSet.add(sugar);
		ingredientsSet.add(apple);
		ingredientsSet.add(saffron);

		// Sort the list alphabetically
		List<Ingredient> sortedIngredientsList = new ArrayList<>(ingredientsSet); // Creating a list from the set.
		Collections.sort(sortedIngredientsList); // Sorting the list of ingredients alphabetically based on their names.

		// Print the sorted list
		System.out.println(sortedIngredientsList); // Printing the sorted list.
	}
}
