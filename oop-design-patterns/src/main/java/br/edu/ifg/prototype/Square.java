package br.edu.ifg.prototype;

public class Square extends Shape{

	private int arrow;
	
	
	public Square arrow(int arrow) {
		this.arrow = arrow;
		return this;
	}
	
	public Square build() {
		super.numberOfSides = 1;
		return this;
	}



	@Override
	public double calculateArea() {
		return Math.pow(arrow, 2);
	}

	@Override
	protected Shape clone() {
		return new Square();
	}
}
