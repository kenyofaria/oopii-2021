package br.edu.ifg.prototype;

public class Rectangle extends Shape{

	private int arrowA;
	private int arrowB;

	
	public Rectangle arrowA(int a) {
		arrowA = a;
		return this;
	}
	public Rectangle arrowB(int b) {
		arrowB = b;
		return this;
	}
	
	public Rectangle build() {
		super.numberOfSides = 2;
		return this;
	}

	@Override
	public double calculateArea() {
		return arrowA*arrowB;
	}
	
	@Override
	protected Shape clone() {
		return new Rectangle();
	}

}
