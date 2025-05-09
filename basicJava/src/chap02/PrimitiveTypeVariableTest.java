package chap02;
//기본형의 리터럴
public class PrimitiveTypeVariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사용자가 입력하는 값을 리터럴이라 한다.
		/*
		 * 정수형
		 * 정수형 리터럴은 기본타입이 int
		 * int i=10
		 * 	   - --
		 * 	   변수 리터럴
		 * 
		 */
		byte b=127;
		short s=32767;
		int i=2147483647;
		long l=2147483647L;//int를 벗어나면 long으로 정의해야한다.
							//L이나l을 추가해서 long형의 리터럴로 변경
		System.out.println(b);
		
		//[실수형]
		//실수형 리터럴의 기본타입은 double
		float f=10.5f;
		double d=10;
		System.out.println(d/3);
		//double형의 변수에 할당되므로 double유형으로 리터럴이 변경된다.
		int data=10;
		double result=data/3;
		System.out.println(result);
		//연산에 포함된 값이 double로 변경되면서 모든 연산은 double연산이 된다.
		System.out.println((double)35/100);
		
		//[문자열]
		//char는 문자를 저장하기 위한 데이터 타입
		//리터럴은 작은따옴표로 표현
		char c='a';
		char c2 ='한';
		System.out.println(c);
		//char의 타입을 int형으로 변환이 가능하다
		//int=char
		int chardata='c';
		//변수 c에 담긴 'a'를 int형으로 강제 변환
		System.out.println((int)'z');
		System.out.println((int)'A');
		System.out.println((int)'Z');	
		
		//[boolean]
		//yes or no,on/off
		//boolean리터럴은 true/false
		boolean bool=true;
		System.out.println(bool);
		
		
	}

}
