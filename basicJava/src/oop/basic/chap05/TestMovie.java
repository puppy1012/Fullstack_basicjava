package oop.basic.chap05;

public class TestMovie { 
	public static void main(String[] args) { 
		Movie myMovie = new Movie();
		myMovie.setTitle("�ܿ�ձ�2");
		myMovie.setGenre("�ִϸ��̼�");
		myMovie.play();
		System.out.println("--------------------");
		Movie yourMovie = new Movie();
		yourMovie.setTitle("�ƹ�Ÿ");
		yourMovie.setGenre("SF");
		yourMovie.play();
		
		System.out.println(yourMovie.getTitle());
		System.out.println(yourMovie.getGenre());
	}
}