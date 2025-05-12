package oop.polymorphism.chap07;
abstract class Parent{
	public abstract void test();
}
class Child1 extends Parent{
	public void test() {
		System.out.println("Child1의 테스트");
	}
}
class Child2 extends Parent{
	public void test() {
		System.out.println("Child2의 테스트");
	}
}
class Child3 extends Parent{
	public void test() {
		System.out.println("Child3의 테스트");
	}
}
class Child4 extends Parent{
	public void test() {
		System.out.println("Child4의 테스트");
	}
}
public class RefTypeCastingTest3 {
	public static void main(String[] args) {
		Child1 obj1 = new Child1();
		Child2 obj2 = new Child2();
		Child3 obj3 = new Child3();
		Child4 obj4 = new Child4();
		Parent obj5 = new Child1();
//		Parent obj6 = new Parent();
		Super obj7 = new Sub();
		run(obj4);
		if(obj4 instanceof Parent) {
			System.out.println("Parent클래스타입");
		}
		else {
			System.out.println("Parent클래스타입이 아닙니다");
		}
	}
	public static void run(Parent child) {
		child.test();

	}
}
