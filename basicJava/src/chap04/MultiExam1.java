package chap04;

import java.util.Scanner;

//주민번호의 7번째 값을 입력받아 성별출력
/*
 * [출력형식]
 * 1,3을 입력하는경우
 * 주민번호입력:_____
 * 남자
 * 
 * 2,4를 입력하는 경우
 * 주민번호입력:____
 * 여자
 * 
 * 이외의 값을 입력하는경우
 * 주민번호입력:___
 * 기타
 */
public class MultiExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.print("주민번호입력:");
		/* String타입 처리
		String num= key.nextLine();
		char gender=num.charAt(6);
		if(gender=='1'||gender=='3') {
			System.out.println("남자");
		}else if(gender=='2'|| gender=='4') {
			System.out.println("여자");
		}else {
			System.out.println("기타");
		}
		*/
		/* long형식 9810121974567 입력시 처리
		long num= key.nextLong();
		long gender=(num/1000000)%10; //나머지 연산을 통해 1의 자리숫자만 추출
		System.out.println(gender);
		if(gender==1||gender==3) {
			System.out.println("남자");
		}else if(gender==2|| gender==4) {
			System.out.println("여자");
		}else {
			System.out.println("기타");
		}
		*/
	}

}
