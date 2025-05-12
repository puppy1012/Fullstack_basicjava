package oop.polymorphism.chap07;
abstract class Parent{
	public abstract void test();
}
class Child1 extends Parent{
	public void test() {
		System.out.println("Child1�� �׽�Ʈ");
	}
}
class Child2 extends Parent{
	public void test() {
		System.out.println("Child2�� �׽�Ʈ");
	}
}
class Child3 extends Parent{
	public void test() {
		System.out.println("Child3�� �׽�Ʈ");
	}
}
class Child4 extends Parent{
	public void test() {
		System.out.println("Child4�� �׽�Ʈ");
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
			System.out.println("ParentŬ����Ÿ��");
		}
		else {
			System.out.println("ParentŬ����Ÿ���� �ƴմϴ�");
		}
	}
	public static void run(Parent child) {
		child.test();

	}
}
