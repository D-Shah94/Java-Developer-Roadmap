package com.github.dshah94.domain; // Declares the package to which this class belongs.

public class Ingredient implements Comparable<Ingredient> { // Defines a class named 'Ingredient' that implements the 'Comparable' interface.

	private String name; // Declares a private instance variable 'name' of type String.
	private double quantity; // Declares a private instance variable 'quantity' of type double.
	private String unit; // Declares a private instance variable 'unit' of type String.

	public Ingredient(String name, double quantity, String unit) { // Constructor that initializes an Ingredient object with a name, quantity, and unit.
		this.name = name; // Assigns the 'name' parameter to the 'name' instance variable.
		this.quantity = quantity; // Assigns the 'quantity' parameter to the 'quantity' instance variable.
		this.unit = unit; // Assigns the 'unit' parameter to the 'unit' instance variable.
	}

	public String getName() { // Declares a method that returns the 'name' of the ingredient.
		return name;
	}

	public double getQuantity() { // Declares a method that returns the 'quantity' of the ingredient.
		return quantity;
	}

	public String getUnit() { // Declares a method that returns the 'unit' of the ingredient.
		return unit;
	}

	public void setName(String newName) { // Declares a method to set a new name for the ingredient.
		this.name = newName;
	}

	public void setQuantity(double newQuantity) { // Declares a method to set a new quantity for the ingredient.
		this.quantity = newQuantity;
	}

	public void setUnit(String newUnit) { // Declares a method to set a new unit for the ingredient.
		this.unit = newUnit;
	}

	@Override
	public String toString() { // Overrides the 'toString' method to provide a custom string representation.
		return "Ingredient: " + name; // Returns a string that represents the ingredient's name.
	}

	@Override
	public int compareTo(Ingredient other) { // Overrides the 'compareTo' method for sorting.
		// Compare ingredients based on their names in alphabetical order.
		return this.name.compareTo(other.name);
	}
}
