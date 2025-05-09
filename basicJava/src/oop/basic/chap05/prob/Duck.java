package oop.basic.chap05.prob;
//문제3번
public class Duck {
	private String name;
	private int legs;
	private int length;
	public Duck() {	
	}
	public void setName(String name) {
		this.name = name;
	}
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("오리("+ name +")는 날지 않습니다." );
	}
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("오리("+ name +")가 소리내어 웁니다." );
		
	}
	public String toString() {
		return "오리의 이름은 "+name+" 입니다."; 
	}
}
