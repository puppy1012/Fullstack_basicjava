package oop.basic.chap05.prob;
//����3��
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
		System.out.println("����("+ name +")�� ���ƴٴմϴ�." );
	}
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("����("+ name +")�� �Ҹ����� ��ϴ�." );
	}
	public String toString() {
		return "������ �̸��� "+name+" �Դϴ�."; 
	}
}
