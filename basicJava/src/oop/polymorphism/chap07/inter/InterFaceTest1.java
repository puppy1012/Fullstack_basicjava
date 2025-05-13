package oop.polymorphism.chap07.inter;
/*
 * �������̽�Ư¡
 * =>�߻�޼ҵ常 �����ϴ� Ư���� Ŭ����
 * =>�������̽��� �����ϰ� ����ϸ� ���߻���� ������ �� �ִ�.
 * 						-----
 * 						�������� ���� �۾�
 * =>������ ����Ÿ������ ���� Ư���� Ŭ����
 * 
 * 1. �������̽��� �����ϴ� ��� classŰ���� ��ſ� interfaceŰ���带 �̿��ؼ� ����
 * 2. �������̽��� �߻�޼ҵ常 �����ϴ� Ư���� Ŭ�����̹Ƿ�
 * 	-	�������̽��� �����ϴ� �޼ҵ�� public abstract�� ������ �߰��ȴٰ� �����ϸ�ȴ�.
 * 			���� ������ �����ϴ�.
 * 3. �������̽��� �������̽��� ����ϴ� ��� extends�� �̿��ؼ� ����Ѵ�.
 * 		-���� ����� �����ϴ�.
 * 		- ,�� �����ؼ� ���
 * 4. �������̽��� �������̽��� ����ϴ� ��� implemnetsŰ���带 �̿��ؼ� ����Ѵ�.
 * 			-���� ����� �����ϰ�  - ,�� �����ؼ� ���
 * 
 * 5. �ϳ��� Ŭ������ Ŭ������ �������̽��� ��� ����ϴ� ���
 * 		class A extends Ŭ���� implements �������̽�1,�������̽�2...{
 * 				-------------
 * 				implements���� ���� ���ǵǾ���Ѵ�.
 * 		}
 */
interface SuperInterfaceA{
//	public abstract void show();
	void show(); //public abstract ����
}
interface SuperInterfaceB{
	void test();
}
interface ChildInterfaceA extends SuperInterfaceA,SuperInterfaceB{
	//abstract�� �Ƚᵵ �̹� �����Ǿ��ֱ⿡ ������ �߻������ʴ´�
}
class Super{
	public void display() {
		System.out.println("display");
	}
}
class ChildA implements SuperInterfaceA,SuperInterfaceB{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterFaceTest1 {
	public static void main(String[] args) {
		ChildA child = new ChildA();
//		run1(child);
		run2(child);
		run3(child);
	}
	public static void run1(Super obj) {
		obj.display();
	}
	public static void run2(SuperInterfaceA obj) {
		obj.show();
	}
	public static void run3(SuperInterfaceB obj) {
		obj.test();
	}
}
