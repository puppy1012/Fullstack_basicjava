package oop.basic.chap05.prob;
//문제3번
public class Sparrow {
	private String name;
	private int legs;
	private int length;
	public Sparrow() {
	}
	public void setName(String name) {
		this.name = name;
	}
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("참새("+ name +")가 날아다닙니다." );
	}
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("참새("+ name +")가 소리내어 웁니다." );
	}
	public String toString() {
		return "참새의 이름은 "+name+" 입니다."; 
	}
}
