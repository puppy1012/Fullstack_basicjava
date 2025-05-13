package oop.polymorphism.chap07.inter;

public class Dog extends Animal {
	public Dog() {}
	public Dog(int speed) {
		super(speed);
		setDistance(0);
		
	}
	@Override
	public void run(int hours) {
		// TODO Auto-generated method stub
		setDistance(getDistance()+getSpeed()*hours/2);
	}
    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"의 이동거리=" + getDistance();
    }

}
