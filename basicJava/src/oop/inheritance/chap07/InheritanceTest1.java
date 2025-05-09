package oop.inheritance.chap07;
/*
 * <<상속관계에서 멤버변수가 갖는 특징>>
 * 1.상속관계에서 상위클래스에 선언된 멤버변수는 하위클래스에서 접근이 가능하다.
 * 2.하위클래스타입의 참조변수를 이용해서 상위클래스에 선언된 멤버변수를 엑세스 할 수 있따.
 * 3.상위클래스에서 선언된 멤버변수명과 동일한 이름의 멤버변수를 하위클래스에서 정의하면 하위클래스 내부에서는
 * 	부모클래스의 멤버변수가 아니라 하위클래스의 멤버변수가 인식된다.
 * 		[객체생성 후 사용]
 * 		-	멤버변수는 선언된 클래스타입에 따라 결정(컴파일시점에 고정)
 * 		-	메소드는 실행시점에 실제로 실행하는 객체의 타입에 따라서 결정(동적바인딩)
 * 4. 하위클래스에서 상위클래스 멤버를 접근하고 싶은 경우 super키워드를 이용해서 접근
 * 		this ->현재 작업중인 자기자신의 객체를 칭함
 * 		super->부모객체
 * 5. 상위클래스의 멤버가 private으로 정의되어있으면 하위클래스에서 엑세스할 수 없다.
 * 	  (상속되지않는다.)
 */
class Super {//상위클래스
	int num=100;
	String data="데이터";
}
class Sub extends Super {//하위클래스
	int num=10000;
	public void display() {
		System.out.println("---------------------------------------");
		System.out.println("num=>"+num);
		System.out.println("this의 num=>"+this.num);
		System.out.println("super의 num=>"+super.num);
		System.out.println("data=>"+data);
		System.out.println("super.data=>"+super.data);
		System.out.println("---------------------------------------");

	}
	
}
public class InheritanceTest1 {
	public static void main(String[] args) {
		Sub obj= new Sub();
		obj.display();
		System.out.println(obj.num);
	}
}
