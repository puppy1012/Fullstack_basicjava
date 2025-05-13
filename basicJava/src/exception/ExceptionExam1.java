package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 예외처리구문연습
 * 사용자가 정수를 입력하면 입력값이 정상적으로 출력되고
 * 문자를 입력하면 "잘못입력했습니다."메시지가 출력될수 있도록 수정
 * 제출
 */
public class ExceptionExam1 {
	public static void main(String[] args) {
		Scanner key= new Scanner(System.in);
		try {
			System.out.println("숫자입력:");
			int data=key.nextInt();
			System.out.println("입력값:"+data);
			//ArithmeticException	산술(수학) 계산 중 에러
			//InputMismatchException	사용자가 입력한 값이 예상 타입과 다를 때
		}catch(InputMismatchException e){
			System.out.println("잘못입력했습니다.");
		}
	}
}
