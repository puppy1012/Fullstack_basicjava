package oop.inheritance.chap07;
class Beverage{
	String type;
	int price;
	
	public Beverage() {}
	public Beverage(String type,int price) {
		this.type=type;
		this.price=price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
public class Coffee extends Beverage{
	String name;
	public Coffee(String type,int price,String name) {
		super(type,price);
//		setType(type);
//		setPrice(price);
		this.name=name;
	}
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("타입:%s,가격:%d,이름:%s\n",getType(),getPrice(),name);
	}
//	public void print() {
//		System.out.printf("타입:%s,가격:%d,이름:%s\n",type,price,name);
//	}
}
