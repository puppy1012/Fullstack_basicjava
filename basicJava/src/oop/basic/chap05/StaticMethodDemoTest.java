package oop.basic.chap05;
//Static메소드와 non-static메소드의 차이점과 사용방법
public class StaticMethodDemoTest {
	public static void main(String[] args) {
		StaticMethodDemo obj=new StaticMethodDemo();
		StaticMethodDemo.print();
		obj.change();
		
		System.out.println("PI값 :"+Math.PI);
		System.out.println("랜덤값: "+Math.random());
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
