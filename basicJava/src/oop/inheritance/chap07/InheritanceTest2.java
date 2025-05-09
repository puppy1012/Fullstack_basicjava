package oop.inheritance.chap07;
/*
 * <<��Ӱ��迡�� �޼ҵ尡 ���� Ư¡>>
 * 1.����Ŭ�������� ���ǵ� �޼ҵ带 ����Ŭ�������� ȣ���� �� �ִ�.
 * 	=> ����Ŭ���� Ÿ���� ���������� ���ؼ��� ����Ŭ������ �޼ҵ带 ����� �� �ִ�.
 * 2. ����Ŭ������ ���ǵ� �޼ҵ�� ������ �޼ҵ带 ����Ŭ�������� �����ϸ� ����Ŭ������ �޼ҵ尡 �켱���� ����ȴ�.
 * 	=> �θ�Ŭ������ �޼ҵ�� ����Ÿ��, �޼ҵ��,�ŰԺ�������,�ŰԺ���Ÿ���� ��� �����ؾ� ���ٰ� �ν�
 * 	=> ����Ŭ�������� �θ�Ŭ������ ���ǵ� �޼ҵ带 ������ �ϴ� ���� ��, �޼ҵ� �������̵�
 * => ����ʵ�� �������ε�, �޼ҵ�� �������ε�
 */

class Parent{
	public void display() {
		System.out.println("�θ��� display");
	}
}
class Child extends Parent{
	public void display() {
		System.out.println("�ڽ�Ŭ������ display");
	}
	public void test() {
		System.out.println("�ڽ�Ŭ������ test()");
		display();
		super.display();
	}

}
public class InheritanceTest2 {
	public static void main(String[] args) {
		Child obj=new Child();
		obj.display();
		obj.test();
	}
}
