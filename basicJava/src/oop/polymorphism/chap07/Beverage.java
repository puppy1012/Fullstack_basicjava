package oop.polymorphism.chap07;

public abstract class Beverage {
	private String name;
	protected int price;
	public Beverage() {}
	public Beverage(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public abstract void calcPrice();
//	public void print(int i) {
//		System.out.println(i+" ��° �Ǹ� ����� "+name+"�̸�, ������ "+price );
//	}
	@Override
	public String toString() {
	    return "�Ǹ� ����: " + name + ", ����: " + price + "��";
	}
}
