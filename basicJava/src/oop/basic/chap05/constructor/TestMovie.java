package oop.basic.chap05.constructor;

public class TestMovie { 
	public static void main(String[] args) { 
		Movie myMovie = new Movie("�ܿ�ձ�2","�ִϸ��̼�");
//		myMovie.setTitle("�ܿ�ձ�2");
//		myMovie.setGenre("�ִϸ��̼�");
		myMovie.play();
		System.out.println("--------------------");

		Movie yourMovie = new Movie("�ƹ�Ÿ","SF");
//		yourMovie.setTitle("�ƹ�Ÿ");
//		yourMovie.setGenre("SF");
		yourMovie.play();
	}

}