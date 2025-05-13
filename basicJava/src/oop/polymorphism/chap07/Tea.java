package oop.polymorphism.chap07;

import java.util.Map;

public class Tea extends Beverage {
	private static int amount;
	private static final Map<String,Integer>MENU_PRICES=Map.of(
			"lemonTea", 1500,
	        "ginsengTea", 2000,
	        "redginsengTea", 2500
			);
	public Tea() {}
	public Tea(String name) {
		super(name);
		calcPrice();
		sell();
	}
	private void sell() {
		// TODO Auto-generated method stub
		amount++;
	}
	public static int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public void calcPrice() {
		// TODO Auto-generated method stub
//		if(super.getName().equals("lemonTea")) {
//			super.setPrice(1500);
//		}else if(super.getName().equals("ginsengTea")) {
//			super.setPrice(2000);
//		}else if(super.getName().equals("redginsengTea")) {
//			super.setPrice(2500);
//		}
		setPrice(MENU_PRICES.getOrDefault(getName(), 0));
	}

}
