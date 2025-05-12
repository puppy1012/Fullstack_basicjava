package oop.polymorphism.chap07;

public abstract class Content {
	private String title;
	private int price;
	public Content() {
		
	}
	public Content(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public abstract void totalPrice();
	public void show() {
		// TODO Auto-generated method stub
		System.out.printf("%s ������ ������ %d�� �Դϴ�.\n",title,price);
	}	
	
}
