package br.edu.ifg.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<Shape>();
		List<Shape> shapesCopy = new ArrayList<Shape>();
		
		Shape r1 = new Rectangle().arrowA(2).arrowA(1).build();
		Shape r2 = new Rectangle().arrowA(3).arrowA(1).build();
		Square s1 = new Square().arrow(2).build();
		Square s2 = new Square().arrow(3).build();
		
		shapes = Arrays.asList(r1, s1, r2, s2);
		
		cloneAndCompare(shapes, shapesCopy);
	
	}
	
	 private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
	        for (Shape shape : shapes) {
	            shapesCopy.add(shape.clone());
	        }

	        for (int i = 0; i < shapes.size(); i++) {
	            if (shapes.get(i) != shapesCopy.get(i)) {
	                System.out.println(i + ": Shapes are different objects (yay!)");
	                if (shapes.get(i).equals(shapesCopy.get(i))) {
	                    System.out.println(i + ": And they are identical (yay!)");
	                } else {
	                    System.out.println(i + ": But they are not identical (booo!)");
	                }
	            } else {
	                System.out.println(i + ": Shape objects are the same (booo!)");
	            }
	        }
	    }
}
