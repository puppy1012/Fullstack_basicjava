package oop.polymorphism.chap07;

public abstract class Shape {
	protected double area;
	private String name;
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Shape() {
		
	}
	public Shape(String name) {
		this.name=name;
	}
	public abstract void calculationArea();

	public void print() {
		// TODO Auto-generated method stub
		System.out.println(name+"�� ������"+area);
	}

}
