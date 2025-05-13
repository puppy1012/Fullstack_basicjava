package oop.polymorphism.chap07;

public class CoffeShop {
	public static void main(String[] args) {
		System.out.println("****java nara CoffeeShop��������****");
		Beverage[] beverage = new Beverage[5];
		beverage[0] = new Coffee("Cappuccino");
		beverage[1] = new Coffee("CafeLatte");
		beverage[2] = new Tea("ginsengTea");
		beverage[3] = new Coffee("CafeLatte");
		beverage[4] = new Tea("redginsengTea");
		getSalesInfo(beverage);
		System.out.println("�� �Ǹ� �ݾ�==>"+getTotalPrice(beverage));
		System.out.println("Coffe�� �Ǹ� ����=>"+Coffee.getAmount()+"��");
		System.out.println("Tea�� �Ǹ� ����=>"+Tea.getAmount()+"��");
	}
	//����� ���� ������ ���ϰ� �Ǹ������� ����� �� �ֵ��� getSalesInfo�޼ҵ带 �ۼ��ϼ���
	private static void getSalesInfo(Beverage[] beverage) {
		// TODO Auto-generated method stub
		for(int i=0;i<beverage.length;i++) {
			System.out.println((i + 1) + "��° �� " + beverage[i]);
		}
	}
	
	//����� ���� �� �Ǹűݾ��� ���� �� �ֵ��� getTotalPrice�޼ҵ带 �ۼ��ϼ���.
	private static int getTotalPrice(Beverage[] beverage) {
		// TODO Auto-generated method stub
		int totalprice=0;
		for(int i=0;i<beverage.length;i++) {
			totalprice+=beverage[i].getPrice();
		}
		return totalprice;
	}
}
