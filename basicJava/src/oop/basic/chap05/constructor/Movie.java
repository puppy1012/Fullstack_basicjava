package oop.basic.chap05.constructor;

public class Movie {
	String title;//��ȭ��
	String genre;//�帣
	public Movie() {
		
	}
	public Movie(String title,String genre) {
		this.title=title;
		this.genre=genre;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getTitle() {
		return title;
	}
	public String getGenre() {
		return genre;
	}
	public void play() {
		System.out.println(title+"("+genre+") �����Դϴ�.");
	}
}
