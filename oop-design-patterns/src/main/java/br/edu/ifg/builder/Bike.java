package br.edu.ifg.builder;

public abstract class Bike {

	public String make;
	public String model;
	public int height;
	public String color;
	
	
	public Bike(String make, String model, int height, String color) {
		super();
		this.make = make;
		this.model = model;
		this.height = height;
		this.color = color;
	}
	
	@Override
	public String toString() {
		String lineSeparator = "\n------------------------------------------------------------------------\n";
		return lineSeparator + this.make + "\n" + this.model + "\n" + this.height + "\n" + this.color + lineSeparator;
	}
}
