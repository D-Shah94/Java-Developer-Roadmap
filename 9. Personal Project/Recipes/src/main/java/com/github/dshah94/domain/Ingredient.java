package com.github.dshah94.domain;

public class Ingredient implements Comparable<Ingredient> {
	private String name;
	private double quantity;
	private String unit;

	public Ingredient(String name, double quantity, String unit) {
		this.name = name;
		this.quantity = quantity;
		this.unit = unit;
	}

	public String getName() {
		return name;
	}

	public double getQuantity() {
		return quantity;
	}

	public String getUnit() {
		return unit;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public void setQuantity(double newQuantity) {
		this.quantity = newQuantity;
	}

	public void setUnit(String newUnit) {
		this.unit = newUnit;
	}

	@Override
	public String toString() {
		return "Ingredient: " + name;
	}

	@Override
	public int compareTo(Ingredient other) {
		// Compare ingredients based on their names
		return this.name.compareTo(other.name);
	}
}
