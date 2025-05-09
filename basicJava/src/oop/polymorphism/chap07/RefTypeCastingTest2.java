package oop.polymorphism.chap07;
class Super{
	String data="상위클래스";
	public void display() {
		System.out.println("super의 display");
	}
}
class Sub extends Super{
	String data="하위클래스";
	public void display() {
		System.out.println("sub의 display");
	}
	public void test() {
		System.out.println("sub의 test");
	}
}
public class RefTypeCastingTest2 {
	public static void main(String[] args) {
		System.out.println("1. Super타입의 참조변수로 Super객체를 사용");
		Super obj1= new Super();
		obj1.display();
		System.out.println(obj1.data);
		System.out.println("***********************");
		System.out.println("2. Sub타입의 참조변수로 Sub객체를 사용");
		Sub obj2= new Sub();
		obj2.display();
		System.out.println(obj2.data);
		System.out.println("***********************");
		System.out.println("3. Super타입의 참조변수로 Sub객체를 사용");
		Super obj3= new Sub();
		obj3.display();
		System.out.println(obj3.data);
		System.out.println("***********************");
		
		//obj3이 Super타입의 참조변수이지만 실제 참조하고있는 생성된 객체는 Sub객체이므로 obj을 서브객체참조변수로
		//변환이 가능하다.-다운캐스팅
		((Sub)obj3).test();
		
		//Super는 Sub이 아니므로 변환할 수 없다.
		//Super가 형을 변환하려고 하는 Sub의 정보 중 없는 정보도 있으므로 완벽하게 변환할 수 없다.
		
		System.out.println("4. Sub타입의 참조변수로 Super객체를 사용");
		
		System.out.println("***********************");
		
		System.out.println("5. Sub 변수 = Super객체를 참조하는 변수");
		//명시적으로 캐스팅시 컴파일러를 속일 수 있다.
		//obj1이 참조하는 객체가 Super이므로 Sub정보가 없어서 실행할때 캐스팅을 할 수 없어 오류가 발생한다.
//		Sub obj5=(Sub)obj1;
		System.out.println("6. Sub 변수 =Sub객체를 참조하는 Super변수");
		Sub obj6=(Sub)obj3;
		System.out.println();
	}
}
