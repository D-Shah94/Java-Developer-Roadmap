package com.github.dshah94;

import com.github.dshah94.domain.Ingredient;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class EntryPointList {

	public static void main(String[] args) {
		System.out.println("This is a list of my ingredients");
		Ingredient tomato = new Ingredient("Tomato", 3.0, "g"); //creating an object (or an instance of the class Ingredient)
		Ingredient onion = new Ingredient("Onion", 4.0, "g");  //creating an Onion object (which is an instance of the class Ingredient)
		Ingredient salt = new Ingredient("Salt", 1000, "g");
		Ingredient sugar = new Ingredient("Sugar", 2000, "g");
		Ingredient apple = new Ingredient("Apple", 10, "kg");
		Ingredient saffron = new Ingredient("Saffron", 500, "g");

		List<Ingredient> ingredients = new ArrayList<>();

		// Adding objects to our list of Ingredients (of type "Ingredient")
		ingredients.add(tomato);
		ingredients.add(onion);
		ingredients.add(salt);
		ingredients.add(sugar);
		ingredients.add(apple);
		ingredients.add(saffron);

		// Print newly created list
		System.out.println(ingredients);

		// Using the toString method
		String tomatoString = tomato.toString();

		System.out.println(tomatoString);


		// Sort the list alphabetically
		Collections.sort(ingredients);

		// Now, ingredients list is sorted alphabetically
		System.out.println(ingredients);

		System.out.println("The number of items in this list is " + ingredients.size());

		// Alternative method of doing a for loop

		int count = 0;
		for (Ingredient ingredient: ingredients) {
			if (ingredient.get("S")) {
				count++;
				System.out.println(ingredient);
			}
		}
		System.out.println(count);

		/* 		Basic method of doing a for loop

		for (int i=0; i < ingredients.size(); i++) {
			System.out.println(ingredients.get(i));
		}

		*/
	}

}
