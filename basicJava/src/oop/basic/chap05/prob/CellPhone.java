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
			System.out.println("�����ð��Է¿���");
		}else {
			battery+=time*3;
			if(battery>100){
				battery=100;
			}
			System.out.println("���� �ð� : "+time+"��");
		}
	}
	public void printBattery() {
		// TODO Auto-generated method stub
		System.out.println("���� ���͸� �� : "+battery);
	}
	public void call(int time) {
		// TODO Auto-generated method stub
		if(time<0){
			System.out.println("��ȭ�ð��Է¿���");
		}else if(battery>((double)time*0.5)) {
			battery-=((double)time*0.5);
			System.out.println("��ȭ �ð� : "+time+"��");
		}else {
			battery=0;
			System.out.println("��ȭ �ð� : "+time+"��");
		}
	}
	/*
	public boolean equals(Object otherObject) {
		//1.Object�� ���� otherObject�� ���� model�� ���� Ŭ�������� �Ǻ�
		//2.���ΰ��� �� �� ��ȯó��
//		return model !=null && model.equals(otherObject);
		if(this==otherObject)return true;
		if(otherObject == null || getClass() !=otherObject.getClass())return false;
		CellPhone other =(CellPhone)otherObject;
		return Objects.equals(this.model, other.model);
	}
	*/

	public boolean equals(Object otherObject) {
//	    System.out.println("equals ȣ���!");
		//�� ��ü�� �޸𸮿��� ������ ���� �ּҸ� �������ִٸ�
	    if (this == otherObject) {
//	        System.out.println("���� ��ü�Դϴ�.");
	        return true;
	    }
	    //���� ���ڰ� null�̰ų� Ŭ���� Ÿ���� �ٸ��� 
	    if (otherObject == null || getClass() != otherObject.getClass()) {
//	        System.out.println("null�̰ų� Ŭ���� �ٸ�");
	        return false;
	    }
	    //���� Ŭ����Ÿ���� ���ε����Ͱ��� ������ ��(������ ��)
	    CellPhone other = (CellPhone) otherObject;
	    boolean result = Objects.equals(this.model, other.model);
//	    System.out.println("�� ��: " + this.model + ", ��� ��: " + other.model + " -> ���: " + result);
	    return result;
	}
}
