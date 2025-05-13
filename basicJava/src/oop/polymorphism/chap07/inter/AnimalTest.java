package oop.polymorphism.chap07.inter;

public class AnimalTest {
	public static void main(String[] args) {
		Animal dog = new Dog(8);
		Animal chicken = new Chicken(3);
		Chicken cheatableChicken = new Chicken(5);
		if(cheatableChicken instanceof Chicken){
			cheatableChicken.fly();
		}
		//3시간 이동처리
		for(int i=0;i<3;i++) {
			dog.run(1);
			chicken.run(1);
			cheatableChicken.run(1);
			System.out.println((i+1)+"시간 후");
			System.out.println(dog);
			System.out.println(chicken);
			System.out.println(cheatableChicken);
		}
	}
	
//	public void processing() {
//		for(int i=0;i<3;i++) {
//			System.out.println((i+1)+"시간 후");
//			System.out.println(dog[0]);
//			System.out.println(chicken);
//			System.out.println(cheatableChicken);
//		}
//	}
}












