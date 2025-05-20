package practice;

public class ITBook extends Book{
	private String category;
	public ITBook() {
		
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return super.toString()+"ITBook [category=" + category + "]";
	}
	public ITBook(String category) {
		super();
		this.category = category;
	}
	public ITBook(String title, int price, String category) {
		// TODO Auto-generated constructor stub
		super(title,price);
		this.category=category;
	}
	
}
