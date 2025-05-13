package oop.polymorphism.chap07;

public class Circle extends Shape {
	private double radius;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(String name, double radius) {
		// TODO Auto-generated constructor stub
		super(name);
		this.radius=radius;
	}

	@Override
	public void calculationArea() {
		// TODO Auto-generated method stub
		super.setArea(Math.PI*(Math.pow(radius, 2)));
	}

}
