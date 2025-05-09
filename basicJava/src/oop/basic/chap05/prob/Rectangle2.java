package oop.basic.chap05.prob;

public class Rectangle2 {
	private int width;
	private int length;
	private String color;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int area() {
		return width*length;
	}
	public int perimeter() {
		// TODO Auto-generated method stub
		return width*2+length*2;
	}
	
}
