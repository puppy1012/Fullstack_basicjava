package chap02;

import java.util.Random;

//api 에서 제공되는 클래스를 사용하기
public class APIexam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("프로그램 시작");
//		int i=100;
//		System.out.println("기본형변수=>"+i);
//		Random rand1=new Random();
//		Random rand2=new Random();
//		System.out.println("참조형변수=>"+rand1);
//		System.out.println("참조형변수=>"+rand2);
		/*
		 * [API를 사용하는 방법]
		 * java programming이라는 문자열을 이용해서 String객체를 생성
		 * charAT이라는 메소드를 호출해서 결과를 출력하기
		 * charAT의 매게변수는 5를 정의
		 * 
		 * 1.String클래스의 기능을 사용하기위해서 String클래스를 heap에 할당
		 * 2.할당된 String객체의 메소드를 사용하기위해서 .연산자를 이용해서 heap에 할당된 
		 * 	string 객체의 기능을 참조해서 사용(메소드의 호출)
		 * 3.메소드 실행결과(리턴값)가 있으면 결과와 같은 타입의 변수를 선언해서
		 * 	메소드의 실행결과를 저장
		 * 4. 메소드의 매게변수를 API문서에서 확인하기
		 * 5. 결과를 sysout으로 출력하기
		 * 출력형식
		 * 5번위치의 문자열=>_____
		 */
		int point=5;
		String original= new String("java programming");
		char result = original.charAt(point);
		System.out.println(point+"번째위치의 문자=>"+result);
		
	}

}
