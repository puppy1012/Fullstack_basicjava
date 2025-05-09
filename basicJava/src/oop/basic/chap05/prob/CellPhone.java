package oop.basic.chap05.prob;

import java.util.Objects;

public class CellPhone {
	private String model;
	private double battery;
	public CellPhone(String model) {
		this.model=model;
		battery=0;
	}
	public void charge(int time) {
		// TODO Auto-generated method stub
		if(time<0) {
			System.out.println("충전시간입력오류");
		}else {
			battery+=time*3;
			if(battery>100){
				battery=100;
			}
			System.out.println("충전 시간 : "+time+"분");
		}
	}
	public void printBattery() {
		// TODO Auto-generated method stub
		System.out.println("남은 배터리 양 : "+battery);
	}
	public void call(int time) {
		// TODO Auto-generated method stub
		if(time<0){
			System.out.println("통화시간입력오류");
		}else if(battery>((double)time*0.5)) {
			battery-=((double)time*0.5);
			System.out.println("통화 시간 : "+time+"분");
		}else {
			battery=0;
			System.out.println("통화 시간 : "+time+"분");
		}
	}
	/*
	public boolean equals(Object otherObject) {
		//1.Object로 들어온 otherObject가 비교할 model과 같은 클래스인지 판별
		//2.내부값을 비교 후 반환처리
//		return model !=null && model.equals(otherObject);
		if(this==otherObject)return true;
		if(otherObject == null || getClass() !=otherObject.getClass())return false;
		CellPhone other =(CellPhone)otherObject;
		return Objects.equals(this.model, other.model);
	}
	*/

	public boolean equals(Object otherObject) {
//	    System.out.println("equals 호출됨!");
		//두 객체가 메모리에서 완전히 같은 주소를 가지고있다면
	    if (this == otherObject) {
//	        System.out.println("같은 객체입니다.");
	        return true;
	    }
	    //들어온 인자가 null이거나 클래스 타입이 다르면 
	    if (otherObject == null || getClass() != otherObject.getClass()) {
//	        System.out.println("null이거나 클래스 다름");
	        return false;
	    }
	    //같은 클래스타입의 내부데이터값이 같은지 비교(내용을 비교)
	    CellPhone other = (CellPhone) otherObject;
	    boolean result = Objects.equals(this.model, other.model);
//	    System.out.println("내 모델: " + this.model + ", 상대 모델: " + other.model + " -> 결과: " + result);
	    return result;
	}
}
