package oop.basic.chap05;
//Static�޼ҵ�� non-static�޼ҵ��� �������� �����
public class StaticMethodDemoTest {
	public static void main(String[] args) {
		StaticMethodDemo obj=new StaticMethodDemo();
		StaticMethodDemo.print();
		obj.change();
		
		System.out.println("PI�� :"+Math.PI);
		System.out.println("������: "+Math.random());
		test2();
//		test();
	}
	public void test() {
		System.out.println("test");
	}
	public static void test2() {
		System.out.println("test2");
	}
}
