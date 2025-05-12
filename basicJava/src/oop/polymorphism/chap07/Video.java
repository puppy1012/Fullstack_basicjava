package oop.polymorphism.chap07;

public class Video extends Content{
	private String genre;
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Video() {
		
	}
	public Video(String title,String genre) {
		super(title);
		this.genre=genre;
	}
	@Override
	public void totalPrice() {
		// TODO Auto-generated method stub
//		switch(genre) {
//		case "new":
//			super.setPrice(super.getPrice()+2000);
//			break;
//		case "comic":
//			super.setPrice(super.getPrice()+1500);
//			break;
//		case "child":
//			super.setPrice(super.getPrice()+1000);
//			break;
//		default:
//			super.setPrice(super.getPrice()+500);
//			break;
//		}
		if(genre.equals("new")) {
			super.setPrice(super.getPrice()+2000);
		}else if(genre.equals("comic")){
			super.setPrice(super.getPrice()+1500);
		}else if(genre.equals("child")){
			super.setPrice(super.getPrice()+1000);
		}else {
			super.setPrice(super.getPrice()+500);
		}
	}
}