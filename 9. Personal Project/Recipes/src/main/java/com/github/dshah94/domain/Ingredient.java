package com.github.dshah94.domain;

/*
Creating an "Ingredient" class. This class should have attributes that represent the properties
of an ingredient, such as name, quantity and measurement unit.
*/
public class Ingredient {
	private String name;
	private double quantity;
	private String unit;

	/*
	Constructors are used to create and initialise objects when they're first created.
	This can be used to create an "Ingredient" object with specified attributes.
	 */

	public Ingredient(String name, double quantity, String unit) {
		this.name = name;
		this.quantity = quantity;
		this.unit = unit;

	}

	/*
	Getters are used to retrieve (get) the values of private attributes of an object.
	They provide controlled access to these attributes from outside the class.
	 */

	public String getName() {
		return name;
	}

	public double getQuantity() {
		return quantity;
	}

	public String getUnit() {
		return unit;
	}



	/*
	Setters are used to modify (set) the values of private attributes of an object.
	They provide controlled ways to update the internal state of an object.
	 */

	public void setName(String newName) { // Declare variables in setter method argument before using them
		this.name = newName;
	}

	public void setQuantity(double newQuantity) {
		this.quantity = newQuantity;
	}

	public void setUnit(String newUnit) {
		this.unit = newUnit;
	}

	@Override // overriding the toString method with our own custom toString method created in the Ingredient class
	public String toString() {
		return "Ingredient: " + name;
	}



}
