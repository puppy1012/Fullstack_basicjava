package chap03;
//논리연산자,비교연산자
public class OprTest2 {
	//비교연산자= true/false를 반환하는 연산자
	public static void main(String[] args) {
		int num1=100;
		int num2=200;
		int num3=300;
		System.out.println("num1==num2 : "+(num1==num2));
		System.out.println("num1>=num2 : "+(num1>=num2));
		System.out.println("num1<=num2 : "+(num1<=num2));
		System.out.println("num1!=num2 : "+(num1!=num2));
		
		//참조형변수에 초기값을 줄때 사용
		String str=null;
		//&&연산
		System.out.println(num1<100&&(str.length()>10));
//		System.out.println(num1<100 &(str.length()>10));
		
		//||연산과 |연산은 동일한 연산(or연산)
		System.out.println(num1>=100|| str.length()>10);
		System.out.println(num1>=100|| str.length()>10);
		
		
		
	}

	
}
