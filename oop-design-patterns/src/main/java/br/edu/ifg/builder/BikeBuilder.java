package br.edu.ifg.builder;

public class BikeBuilder implements IBikeBuilder {

	private String color;
	private int height;
	private String make;
	
	public Bike build() {	
		switch (height) {
		case 29:
			return new MoutainBike(make, "Moutain", height, color);
		case 26:
			return new SpeedBike(make, "Speed", height, color);
		case 20:
			return new CrossBike(make, "Cross", height, color);
		default:
			return null;
		}
	}
	
	public BikeBuilder make(String make) {
		this.make = make;
		return this;
	}
	
	
	public BikeBuilder height(int height) {
		this.height = height;
		return this;
	}
	
	public BikeBuilder color(String color) {
		this.color = color;
		return this;
	}
	

}
