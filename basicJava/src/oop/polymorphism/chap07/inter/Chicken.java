package oop.polymorphism.chap07.inter;

public class Chicken extends Animal implements Cheatable {
	private boolean isCheatable = false;  // �߰�!

	public void setCheatable(boolean flag) {
	    this.isCheatable = flag;
	}
	public Chicken() {}
	public Chicken(int speed) {
		super(speed);
		setDistance(0);
	}
	
	@Override
	public void run(int hours) {
		// TODO Auto-generated method stub
		setDistance(getDistance()+getSpeed()*hours);
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		setSpeed(getSpeed()*2);
		setCheatable(true);
		
	}
	@Override
	public String toString() {
	    if (isCheatable) {
	        return "������ ���� �̵��Ÿ�=" + getDistance();
	    } else {
	        return this.getClass().getSimpleName()+"�� �̵��Ÿ�=" + getDistance();
	    }
	}

}
