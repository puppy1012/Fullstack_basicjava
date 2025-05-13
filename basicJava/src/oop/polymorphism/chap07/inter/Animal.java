package oop.polymorphism.chap07.inter;

public abstract class Animal {
	private int speed;
	private double distance;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public Animal() {}
	public Animal(int speed) {
		this.speed=speed;
	}
	public abstract void run(int hours);
	
	public String toString() {
		return "동물의 이동거리="+speed;
	}
}
