package oop.inheritance.chap07;
/*
 * final�� Ŭ����,����,�޼ҵ忡 �߰��� ���ִ�.
 * ���� - ���(���� ���Ҵ��ϴ°��� �Ұ���)
 * �޼ҵ� - �������̵��� �Ұ����� �޼ҵ� ����
 * Ŭ���� - ����� �Ұ����� Ŭ���� ����
 */
class A{
	int num=100;
	public static final int NUM_VALUE= 10000;
	public void test() {
		num=1000;
//		NUM_VALUE=20000; ����� ������ �Ұ���
	}
	public final void display() {
		System.out.println("���� display");
	}
}
class B extends A{
//	public void display() {
//		System.out.println("���� display");
//	}
}
public class FinalTest {
	public static void main(String[] args) {
		B obj= new B();
		obj.display();
	}
}
