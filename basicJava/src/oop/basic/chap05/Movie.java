package oop.basic.chap05;

public class Movie {
	private String Title;
	private String Genre;
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	public void play() {
		System.out.printf("%s(%s) �����Դϴ�.\n",Title,Genre);
	}
	
}
