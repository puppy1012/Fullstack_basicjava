package oop.polymorphism.chap07;

public class Rectangular extends Shape {
	private double width;
	private double hight;
	public Rectangular() {
		
	}
	public Rectangular(String name, double width,double hight) {
		// TODO Auto-generated constructor stub
		super(name);
		this.width=width;
		this.hight=hight;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	@Override
	public void calculationArea() {
		// TODO Auto-generated method stub
		super.setArea(hight*width);
	}
}
