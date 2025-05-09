package HardExam;

public class Book {
	private String name;
	private int price;
	public Book() {
		
	}
	public Book(String name,int price) {
		super();
		this.name=name;
		this.price=price;
	}
	public void setTitle(String name) {
		this.name=name;
	}
	public String getTitle() {
		return this.name;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return this.price;
	}
}
