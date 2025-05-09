package oop.basic.chap05.constructor;

public class TestMovie { 
	public static void main(String[] args) { 
		Movie myMovie = new Movie("겨울왕국2","애니메이션");
//		myMovie.setTitle("겨울왕국2");
//		myMovie.setGenre("애니메이션");
		myMovie.play();
		System.out.println("--------------------");

		Movie yourMovie = new Movie("아바타","SF");
//		yourMovie.setTitle("아바타");
//		yourMovie.setGenre("SF");
		yourMovie.play();
	}

}