package oop.polymorphism.chap07;

import java.util.Map;

public class Coffee extends Beverage {
	private static int amount;
	private static final Map<String,Integer>MENU_PRICES=Map.of(
			"Americano",1500,
			"CafeLatte",2500,
			"Cappuccino",3000
			);
	public Coffee() {}
	public Coffee(String name) {
		// TODO Auto-generated constructor stub
		super(name);
		calcPrice();
		sell();
	}
	
	public static int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void sell() {
		amount++;
	}
	@Override
	public void calcPrice() {
		// TODO Auto-generated method stub
//		if(super.getName().equals("Americano")) {
//			super.setPrice(1500);
//		}else if(super.getName().equals("CafeLatte")) {
//			super.setPrice(2500);
//		}else if(super.getName().equals("Cappuccino")) {
//			super.setPrice(3000);
//		}
		setPrice(MENU_PRICES.getOrDefault(getName(), 0));
	}

}
