package practice;

public class Book {
	private String title;
	private int price;

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

	public Book() {
	}

	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
}
