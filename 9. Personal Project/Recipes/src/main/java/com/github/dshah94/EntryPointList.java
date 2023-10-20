package com.github.dshah94; // Declares the package to which this class belongs.

import com.github.dshah94.domain.Ingredient; // Importing the Ingredient class from a different package.
import java.util.ArrayList; // Importing the ArrayList class.
import java.util.Collections; // Importing the Collections class.
import java.util.List; // Importing the List interface.

public class EntryPointList {

	public static void main(String[] args) { // Main method, the entry point for the program.
		System.out.println("This is a list of my ingredients"); // Printing a message to the console.

		// Creating instances of the Ingredient class
		Ingredient tomato = new Ingredient("Tomato", 3.0, "g"); // Creating an Ingredient object with name, quantity, and unit.
		Ingredient onion = new Ingredient("Onion", 4.0, "g");
		Ingredient salt = new Ingredient("Salt", 1000, "g");
		Ingredient sugar = new Ingredient("Sugar", 2000, "g");
		Ingredient apple = new Ingredient("Apple", 10, "kg");
		Ingredient saffron = new Ingredient("Saffron", 500, "g");

		// Create a list to store Ingredient objects
		List<Ingredient> ingredients = new ArrayList<>(); // Creating a list to store Ingredient objects.

		// Adding Ingredient objects to the list
		ingredients.add(tomato); // Adding an Ingredient object to the list.
		ingredients.add(onion);
		ingredients.add(salt);
		ingredients.add(sugar);
		ingredients.add(apple);
		ingredients.add(saffron);

		// Print the list of ingredients
		System.out.println(ingredients); // Printing the list of ingredients (it uses the 'toString' method of Ingredient).

		// Using the toString method to convert an ingredient to a string
		String tomatoString = tomato.toString();
		System.out.println(tomatoString);

		// Sort the list alphabetically - Demonstrating sorting of objects
		Collections.sort(ingredients); // Sorting the list of ingredients alphabetically based on their names.

		// Now, the ingredients list is sorted alphabetically
		System.out.println(ingredients); // Printing the sorted list.

		// Get the number of items in the list - Illustrating list size
		System.out.println("The number of items in this list is " + ingredients.size()); // Printing the number of items in the list.

		// Count and print ingredients that start with 'S' - Basic iteration
		int count = 0; // Initializing a count variable.
		for (Ingredient ingredient : ingredients) { // Iterating through the list of ingredients.
			if (ingredient.getName().startsWith("S")) { // Checking if the ingredient name starts with 'S'.
				count++; // Incrementing the count.
				System.out.println(ingredient); // Printing the ingredient.
			}
		}
		System.out.println("Count of ingredients starting with 'S': " + count); // Printing the count.
	}
}
