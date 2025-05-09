package oop.basic.chap05;
//MyMethod클래스에서 정의된 메소드를 사용
//=> 메소드 호출
public class MyMethod_Test {
	public static void main(String[] args) {
		MyMethod obj= new MyMethod();
		System.out.println("프로그램시작");
		System.out.println("step1");
		obj.display();
		obj.display();
		System.out.println("step2");

		obj.display("*");
		obj.display("#");
		obj.display("*");
		System.out.println("step3");
		obj.display("backend_10 ", 20);
		
		
		
		
		//4번.매개변수,리턴값이 모두 있는 메소드
		//	1)리턴값이 있는 메소드를 호출하는 경우 리턴타입과 동일한 타입의 변수를 선언해서 리턴값을 저장한다.
		int result=obj.add(1000, 2000);
		System.out.println(result);
		
		//	2)메소드의 호출결과를 다른 메소드의 매겨변수로 전달하거나, 바로 호출해서 작업이 가능하다.
		//	=>void메소드는 다른메소드의 매게변수로 사용할 수 없다.
		System.out.println("계산결과=>"+obj.add(3000, 4000));
		if(obj.add(3000, 4000)>3000) {
			System.out.println("통과");
		}else {
			System.out.println("다시작업");
		}
		
		
		
		
//		MyMethod.Star();
	}
}
