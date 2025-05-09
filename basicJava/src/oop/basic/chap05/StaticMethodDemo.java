package oop.basic.chap05;

public class StaticMethodDemo {
	public StaticMethodDemo() {
		System.out.println("StaticMethodDemo 생성");
	}
	public static void print(){//정적
		System.out.println("+++++++++print++++++++");
		display();
	}
	public static void display(){//정적메소드
		System.out.println("+++++++++display++++++++");
		StaticMethodDemo obj= new StaticMethodDemo();
		obj.test();
	}
	public void test(){//인스턴스메소드
		System.out.println("+++++++++test++++++++");
	}
	public static void show(){//정적메소드
		System.out.println("+++++++++show++++++++");
	}
	public void change(){//인스턴스메소드
		System.out.println("+++++++++change++++++++");
		//2.non-static 메소드에서 non-static메소드를 호출하느 ㄴ경우
		//=>일반적인 방법으로 메소드 호출
		this.test();
		show();
	}
}
