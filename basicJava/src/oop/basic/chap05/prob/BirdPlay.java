package oop.basic.chap05.prob;
public class BirdPlay {
 	public static void main(String s[]){
		Duck duck = new Duck();
		duck.setName("�в���");
		duck.fly();
		duck.sing();
		System.out.println(duck.toString());
		
		Sparrow sparrow = new Sparrow();
		sparrow.setName("±±");
		sparrow.fly();
		sparrow.sing();
		System.out.println(sparrow.toString());
	
		
	}

}
