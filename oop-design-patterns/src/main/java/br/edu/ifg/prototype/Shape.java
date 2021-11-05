package br.edu.ifg.prototype;

public abstract class Shape{

	protected int numberOfSides;

	@Override
	protected abstract Shape clone();
	 

	public abstract double calculateArea();
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Shape)) {
			return false;
		}
		Shape o = (Shape) obj;
		return o.numberOfSides == o.numberOfSides; 
	}
}
