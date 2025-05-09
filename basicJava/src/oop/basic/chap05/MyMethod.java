package oop.basic.chap05;
//메소드를 유형별로 정의
public class MyMethod {
	//1.매개변수가 없고 리턴값이 없는 메소드
	public  void display() {
		for(int i=0;i<=10;i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("----------------------");
	}
	//2. 리턴값이 없고 매개변수가 1개인 메소드
	public void display(String str) {
		for(int i=0;i<=10;i++) {
			System.out.print(str);
		}
		System.out.println();
		System.out.println("----------------------");
	}
	//3. 리턴값이 없고 매게변수가 2개인 메소드
	//=> 출력할 기호가 출력할 횟수를 매개변수로 전달받아서 사용할 수 있도록 메소드를 정의
	public void display(String str,int number) {
		for(int i=0;i<number;i++) {
			System.out.print(str);
		}
		System.out.println();
		System.out.println("------------------------");
	}
	//4번.매개변수,리턴값이 모두 있는 메소드
	//=> 숫자2개(정수)를 매개변수로 전달 받아서 더한 후 결과를 리턴하는메소드
	//=>메소드 선언부에 리턴타입으로 정의되는 타입과 무조건 동일한 타입의 값
	//	혹은 값이 저장된 변수를 리턴해야한다.
	//=>리턴하는 값은 무조건 한개만 리턴할 수 있다.
	//=>리턴은 메소드의 마지막 명령문에서 return키워드와 함께 리턴한다.
	//	리턴하는 값은 무조건 한개만 리턴할 수 있다.
	public int add(int num1,int num2) {
		int result=0;
		result=num1+num2;
		return result;
		
	}
}
