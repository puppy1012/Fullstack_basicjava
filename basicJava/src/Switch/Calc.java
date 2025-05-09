package Switch;

import java.util.Scanner;

//public class Calc {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("*******미니계산기*******");
//		System.out.println("1.더하기\n2.곱하기\n3.빼기\n4.나누기");
//		Scanner key = new Scanner(System.in);
//		System.out.print("연산자를 선택하세요.");
//		int type=key.nextInt();
//		key.nextLine();
//		System.out.print("숫자를 입력하세요");
//		String number=key.nextLine();
//		String[] split_number=number.split(" ");
//		//숫자가 두개만 들어온다는 조건
//		double answer=0;
//		int first_one= Integer.parseInt(split_number[0]);
//		int second_one= Integer.parseInt(split_number[1]);
//		if(type==1) {
//			answer=first_one+second_one;
//		}else if(type==2) {
//			answer=first_one*second_one;
//		}else if(type==3) {
//			answer=first_one-second_one;
//		}else if(type==4) {
//			answer=(double)first_one/second_one;
//		}else {
//			System.out.println("잘못된연산자입니다");
//			return;
//		}
//		
//		System.out.println("계산결과=>"+answer);
//	}
//}
public class Calc {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("***********미니계산기***********");
		System.out.println("1.더하기");
		System.out.println("2.곱하기");
		System.out.println("3.빼기");
		System.out.println("4.나누기");
		System.out.print("연산자를 선택하세요.");
		int opr = key.nextInt();
		
		if(opr>=1 & opr<=4) {
			System.out.print("숫자를 입력하세요");
			int num1 = key.nextInt();
			int num2 = key.nextInt();
			//연산결과를 저장할 변수 선언하기
			//메소드를 호출해서 사용하기
			int result = MyMethodDemo.Calc(opr, num1, num2);
			
			
			System.out.println("계산결과=>"+result);
		}else {
			System.out.println("연산자를 잘못 선택했습니다.");
		}
	}
}